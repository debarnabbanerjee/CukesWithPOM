package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class womanPage {

    private WebDriver driver;
    private topMenu topMenuSection;

    public womanPage(WebDriver driver) {
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



}
