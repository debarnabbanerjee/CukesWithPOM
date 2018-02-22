package pages;

import com.sun.jna.platform.win32.OaIdl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class womanPage extends pageBase{

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

    // categories section
    @FindBy(how = How.XPATH, using = "//*[@id='layered_form']/div/div[1]/div/span")
    private WebElement categoriesSectionLabel;

    @FindBy(how = How.XPATH, using = "//*[@id='ul_layered_category_0']")
    private WebElement categoriesSectionContainer;

    public String validateSectionsName(String name, ArrayList<String> list){
        if(name.equalsIgnoreCase("Categories"))
           return categoriesSection(list);

        else if(name.equalsIgnoreCase("Size"))
            return sizeSection(list);

        return "Unable to find the section in the page";
    }
    // validating categories section
    private String categoriesSection(ArrayList<String> listOfElements) {
        String labelText = "";
        ArrayList<String> actualListOfElements = new ArrayList<String>();
        try {
            categoriesSectionLabel.isDisplayed();
            scrollToElement(driver,categoriesSectionLabel);
            List<WebElement> li = categoriesSectionContainer.findElements(By.tagName("li"));
            for (int i = 0; i < listOfElements.size(); i++) {
                WebElement webElement = li.get(i);
                labelText = webElement.findElement(By.tagName("label")).getText();
                actualListOfElements.add(labelText);
                if (!listOfElements.contains(labelText))
                    return labelText + " is not present in the list of the expected category items " + listOfElements.toString();
            }
            return "Categories section in Woman Page validated successfully.";
        } catch (IndexOutOfBoundsException e) {
            return "Mismatch of no of Items in Expected and Actual. Expected - " + listOfElements.toString() +
                    " Actual - " + actualListOfElements.toString();
        }
    }

    // ######################################## END OF CATEGORIES SECTION  #######################


    // ********************************* validating size section   *********************************

    // size section
    @FindBy(how = How.XPATH, using = "//*[@id='layered_form']/div/div[2]/div/span")
    private WebElement sizeSectionLabel;

    @FindBy(how = How.XPATH, using = "//*[@id='ul_layered_id_attribute_group_1']")
    private WebElement sizeSectionContainer;

    private String sizeSection(ArrayList<String> listOfElements){
        String labelText = "";
        ArrayList<String> actualListOfElements = new ArrayList<String>();
        try {
            sizeSectionLabel.isDisplayed();
            scrollToElement(driver,sizeSectionLabel);
            List<WebElement> li = sizeSectionContainer.findElements(By.tagName("li"));
            for (int i = 0; i < listOfElements.size(); i++) {
                WebElement webElement = li.get(i);
                labelText = webElement.findElement(By.tagName("label")).getText();
                actualListOfElements.add(labelText);
                if (!listOfElements.contains(labelText))
                    return labelText + " is not present in the list of the expected size items " + listOfElements.toString();
            }
            return "Size section in Woman Page validated successfully.";
        } catch (IndexOutOfBoundsException e) {
            return "Mismatch of no of Items in Expected and Actual. Expected - " + listOfElements.toString() +
                    " Actual - " + actualListOfElements.toString();
        }

    }

    // ######################################## END OF SIZE SECTION  #######################

}
