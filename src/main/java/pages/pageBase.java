package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageBase {
    private JavascriptExecutor exc;

    public void scrollToElement(WebDriver driver,WebElement element){
        try{
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(1000);

        }catch (Exception e){
            System.out.println("Unable to scroll to element " + e.getMessage().toString());
        }
    }
}
