package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class basicStep {

    private WebDriver driver;
    private Properties prop;
    private FileInputStream ip;

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

    public String getProperty(String key){
        try{
            prop = new Properties();
            ip = new FileInputStream(System.getProperty("user.dir")+"//master.properties");
            prop.load(ip);

            return prop.getProperty(key);

        }catch (Exception e){
            System.out.println("Unable to load properties file");
            return null;
        }
    }
}
