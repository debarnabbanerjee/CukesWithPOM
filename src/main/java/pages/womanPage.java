package pages;

import com.sun.jna.platform.win32.OaIdl;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class womanPage extends pageBase {

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

    public String validateSectionsName(String name, ArrayList<String> list) {
        if (name.equalsIgnoreCase("Categories"))
            return categoriesSection(list);

        else if (name.equalsIgnoreCase("Size"))
            return sizeSection(list);

        else if (name.equalsIgnoreCase("Color"))
            return colorSection(list);

        else if (name.equalsIgnoreCase("Compositions"))
            return compositionSection(list);

        return "Unable to find the section in the page";
    }

    // validating categories section
    private String categoriesSection(ArrayList<String> listOfElements) {
        String labelText = "";
        ArrayList<String> actualListOfElements = new ArrayList<String>();
        try {
            categoriesSectionLabel.isDisplayed();
            scrollToElement(driver, categoriesSectionLabel);
            List<WebElement> li = categoriesSectionContainer.findElements(By.tagName("li"));
            for (int i = 0; i < listOfElements.size(); i++) {
                WebElement webElement = li.get(i);
                labelText = webElement.findElement(By.tagName("label")).getText();
                actualListOfElements.add(labelText);
                if (!listOfElements.contains(labelText))
                    return labelText + " is not present in the list of the expected category items " + listOfElements.toString();
            }
            return "Section in Woman Page validated successfully.";
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

    private String sizeSection(ArrayList<String> listOfElements) {
        String labelText = "";
        ArrayList<String> actualListOfElements = new ArrayList<String>();
        try {
            sizeSectionLabel.isDisplayed();
            scrollToElement(driver, sizeSectionLabel);
            List<WebElement> li = sizeSectionContainer.findElements(By.tagName("li"));
            for (int i = 0; i < listOfElements.size(); i++) {
                WebElement webElement = li.get(i);
                labelText = webElement.findElement(By.tagName("label")).getText();
                actualListOfElements.add(labelText);
                if (!listOfElements.contains(labelText))
                    return labelText + " is not present in the list of the expected size items " + listOfElements.toString();
            }
            return "Section in Woman Page validated successfully.";
        } catch (IndexOutOfBoundsException e) {
            return "Mismatch of no of Items in Expected and Actual. Expected - " + listOfElements.toString() +
                    " Actual - " + actualListOfElements.toString();
        }

    }

    // ######################################## END OF SIZE SECTION  #######################

    // ********************************* validating COLOR section   *********************************

    // size section
    @FindBy(how = How.XPATH, using = "//*[@id='layered_form']/div/div[3]/div/span")
    private WebElement colorSectionLabel;

    @FindBy(how = How.XPATH, using = "//*[@id='ul_layered_id_attribute_group_3']")
    private WebElement colorSectionContainer;

    private String colorSection(ArrayList<String> listOfElements) {
        String labelText = "";
        ArrayList<String> actualListOfElements = new ArrayList<String>();
        try {
            colorSectionLabel.isDisplayed();
            scrollToElement(driver, colorSectionLabel);
            List<WebElement> li = colorSectionContainer.findElements(By.tagName("li"));
            for (int i = 0; i < listOfElements.size(); i++) {
                WebElement webElement = li.get(i);
                labelText = webElement.findElement(By.tagName("label")).getText();
                actualListOfElements.add(labelText);
                if (!listOfElements.contains(labelText))
                    return labelText + " is not present in the list of the expected color items " + listOfElements.toString();
            }
            return "Section in Woman Page validated successfully.";
        } catch (IndexOutOfBoundsException e) {
            return "Mismatch of no of Items in Expected and Actual. Expected - " + listOfElements.toString() +
                    " Actual - " + actualListOfElements.toString();
        }
    }
    // ######################################## END OF COLOR SECTION  #######################

    // ********************************* validating COMPOSITION section   *********************************

    @FindBy(how = How.XPATH, using = "//*[@id='layered_form']/div/div[4]/div/span")
    private WebElement compositionSectionLabel;

    @FindBy(how = How.XPATH, using = "//*[@id='ul_layered_id_feature_5']")
    private WebElement compositionSectionContainer;

    private String compositionSection(ArrayList<String> listOfElements) {
        String labelText = "";
        ArrayList<String> actualListOfElements = new ArrayList<String>();
        try {
            compositionSectionLabel.isDisplayed();
            scrollToElement(driver, compositionSectionLabel);
            List<WebElement> li = compositionSectionContainer.findElements(By.tagName("li"));
            for (int i = 0; i < listOfElements.size(); i++) {
                WebElement webElement = li.get(i);
                labelText = webElement.findElement(By.tagName("label")).getText();
                actualListOfElements.add(labelText);
                if (!listOfElements.contains(labelText))
                    return labelText + " is not present in the list of the expected color items " + listOfElements.toString();
            }
            return "Section in Woman Page validated successfully.";
        } catch (IndexOutOfBoundsException e) {
            return "Mismatch of no of Items in Expected and Actual. Expected - " + listOfElements.toString() +
                    " Actual - " + actualListOfElements.toString();
        }
    }

    // ######################################## END OF COMPOSITION SECTION  #######################

    // ***************** Searching for an particular item in the page **************************************

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/ul")
    private WebElement itemsContainer;

    public String searchingForTheELementToBeBooked(String name) {
        try {

            itemsContainer.isDisplayed();
            List<WebElement> li = itemsContainer.findElements(By.tagName("li"));
            System.out.println("Size of li is " + li.size());
            try {
                for (int i = 1; i <= li.size(); i++) {
                    if (driver.findElement(By.xpath("//*[@id='center_column']/ul/li[" + i + "]/div/div[2]/h5/a")).isDisplayed()) {
                        String text = driver.findElement(By.xpath("//*[@id='center_column']/ul/li[" + i + "]/div/div[2]/h5/a")).getText();
                        System.out.println("Text is : " + text);
                        if (text.contains(name)) {
                            System.out.println("Found Match in the product");
                            scrollToElement(driver,driver.findElement(By.xpath("//*[@id='center_column']/ul/li[" + i + "]/div/div[2]/h5/a")));
                            return "Able to search for the element.";
                        }
                    }
                }
            } catch (Exception e) {
            }

            return "Some error happend when searching element";

        } catch (ElementNotVisibleException e) {
            return "Unable to search for the elelement " + e.getMessage().toString();
        }

    }

}
