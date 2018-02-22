package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class basicStep {

    private WebDriver driver;
    private Properties prop;
    private FileInputStream ip;
    private boolean isPropertyLoaded=false;


    public WebDriver getDriver() {
        return driver;
    }

    public Properties getProp() {
        return prop;
    }

    public FileInputStream getIp() {
        return ip;
    }

    public WebDriver openBrowser(String browserType){
        if(browserType.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browserType.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//geckodriver.exe");
            driver = new FirefoxDriver();
        }else if(browserType.equalsIgnoreCase("ie")){

        }
        driver.manage().window().maximize();
        if(!isPropertyLoaded)
            loadProperty();
        driver.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("timeout")), TimeUnit.SECONDS);
        return driver;
    }

    public void closeBrowser(){
        if(driver!=null){
            driver.quit();
            return;
        }else {
            System.out.println("Browser already closed");
            return;
        }
    }

    public void navigateToPage(String url){
        driver.navigate().to(url);
    }

    private void loadProperty(){
        try{
            prop = new Properties();
            ip = new FileInputStream(System.getProperty("user.dir")+"//master.properties");
            prop.load(ip);
            isPropertyLoaded=true;

        }catch (Exception e){
            System.out.println("Unable to load properties file");
        }
    }

    public String getProperty(String key){
        try{
            return prop.getProperty(key);
        }catch (Exception e){
            System.out.println("Unable to read from properties file");
            return null;
        }
    }
}
