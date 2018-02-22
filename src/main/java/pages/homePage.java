package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    private WebDriver driver;
    private topMenu topMenuSection;

    public homePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        topMenuSection = new topMenu(this.driver);
    }

    public String checkTopMenuItems() {
        return topMenuSection.validateTopMenuSections();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/div/div[1]/ul/li[1]/a/span")
    private WebElement orderAndHistoryDetails;

    @FindBy(how = How.XPATH, using = "///*[@id='center_column']/div/div[1]/ul/li[2]/a/span")
    private WebElement myCreditSlips;

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/div/div[1]/ul/li[3]/a/span")
    private WebElement myAddress;

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/div/div[1]/ul/li[4]/a/span")
    private WebElement myPersonalInformation;

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/div/div[2]/ul/li/a/span")
    private WebElement myWishLists;

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/p")
    private WebElement welcomeText;

    public String checkHomePageElemements(){
        try{
            orderAndHistoryDetails.isDisplayed();
            myCreditSlips.isDisplayed();
            myAddress.isDisplayed();
            myPersonalInformation.isDisplayed();
            myWishLists.isDisplayed();
            welcomeText.isDisplayed();
            String s = topMenuSection.validateTopMenuSections();
            if(!s.equalsIgnoreCase("All top Menu Items are displayed")){
                return "Top Menu sections in the home page is not correct. Others are fine.";
            }
            return "Home Page Elements are fine.";
        }catch (Exception e){
            return "Home Page Elements are not fine. " + e.getMessage().toString().trim();
        }
    }

    public String clickWomanSectionInHomePage(){
        try{
            topMenuSection.clickWoman();
            if(!driver.getTitle().equalsIgnoreCase("Women - My Store")){
                return "Expected Title - \"Woman - My Store\". But the actual was " + driver.getTitle();
            }
            return "Clicked on the Woman Link from Home Page";
        }catch (Exception e){
            return "Unable to click on Woman Link from Home Page " + e.getMessage().toString().trim();
        }
    }
}
