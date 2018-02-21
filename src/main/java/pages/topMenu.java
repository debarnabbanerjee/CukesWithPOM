package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class topMenu {

    private WebDriver driver;

    protected topMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='header']/div[1]/div/div/a/img")
    private WebElement staticTextAbove;

    @FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[1]/a")
    private WebElement woman;

    @FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[2]/a")
    private WebElement dress;

    @FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[3]/a")
    private WebElement tshirt;

    @FindBy(how = How.XPATH, using = "//*[@id='header']/div[2]/div/div/nav/span/strong")
    private WebElement phoneNumber;

    protected String validateTopMenuSections(){
        try{
            staticTextAbove.isDisplayed();
            woman.isDisplayed();
            dress.isDisplayed();
            tshirt.isDisplayed();
            phoneNumber.isDisplayed();

            return "All top Menu Items are displayed";
        }catch (Exception e){
            return "Top Menu sections are not displayed properly " + e.getMessage().toString().trim();
        }
    }

    protected void clickWoman(){
        woman.click();
    }

    protected void clickDress(){
        dress.click();
    }

    private void clickTShirt(){
        tshirt.click();
    }


}
