package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class landingPage {

    private WebDriver driver;
    private topMenu topMenuSection;

    public landingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        topMenuSection = new topMenu(this.driver);
    }

    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    private WebElement siginLink;

    @FindBy(how = How.LINK_TEXT, using = "Contact us")
    private WebElement contactUs;

    public String clickSignInLink() {
        try {
            siginLink.click();
            if(!driver.getTitle().equalsIgnoreCase("Login - My Store")){
                return "Incorrect Login Page Title";
            }else
                return "Sign In Link Clicked";

        } catch (Exception e) {
            return "Unable to Click SignIn Link " + e.getMessage().toString().trim();
        }
    }

    public String clickContactUsLink() {
        try {
            contactUs.click();
            return "Contact Us Link Clicked";
        } catch (Exception e) {
            return "Unable to Contact Us Link " + e.getMessage().toString().trim();
        }
    }

    public String checkTopMenuItems() {
        return topMenuSection.validateTopMenuSections();
    }
}
