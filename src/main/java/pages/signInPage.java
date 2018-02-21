package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class signInPage {
    private WebDriver driver;
    private topMenu topMenuSection;

    public signInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        topMenuSection = new topMenu(this.driver);
    }

    public String checkTopMenuItems() {
        return topMenuSection.validateTopMenuSections();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='email']")
    private WebElement userName;

    @FindBy(how = How.XPATH, using = "//*[@id='passwd']")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//*[@id='SubmitLogin']/span")
    private WebElement signinBtn;

    @FindBy(how = How.XPATH, using = "//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")
    private WebElement homePageElement;

    @FindBy(how = How.XPATH, using = "//*[@id='header']/div[2]/div/div/nav/div[2]/a")
    private WebElement signOut;

    public String doLogin(String usrName, String psswrd) {
        try {
            userName.sendKeys(usrName);
            password.sendKeys(psswrd);
            signinBtn.click();
            return "Able to click Sigin Button with credentials properly";

        } catch (Exception e) {
            return "Unable to click on SigIn Button with credentials " + e.getMessage().toString().trim();
        }
    }

    public String verifyPostLoginElements(String userNameText) {
        try {
            homePageElement.getText().equalsIgnoreCase(userNameText);
            signOut.isDisplayed();
            if(!driver.getTitle().equalsIgnoreCase("My account - My Store")){
                return "Incorrect Title displayed for Home Page";
            }
            return "Home Page Displayed Properly";
        } catch (Exception e) {
            return "Login Page not loaded properly "+ e.getMessage().toString().trim();
        }
    }

}
