package homepage;

import common.WebAPI;
import org.apache.commons.math3.ode.events.EventHandler;
import org.bson.io.BsonOutput;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import static homepage.HomePageWebElement.*;


public class HomePage  extends WebAPI {
    // Action Method class

    // Find By Annotation: First Approach
    @FindBy(how = How.XPATH, using =insuranceLocator)public WebElement insurance;
    @FindBy(how = How.XPATH, using=driverSafeAndSaveLocator)public  WebElement DriveSfSv;


    public void DropDown(String locator12,String value){
        WebElement element =driver.findElement(By.xpath(locator12));
        Select sel=new Select(element);
        sel.selectByVisibleText(value);
    }

    public void checkInsurance() throws InterruptedException {
        insurance.click();
        sleepFor(2);
        clickByXpath("//*[@id=\"oneX-submenu-insurance\"]/div/div/div[1]/section/ul/li[1]/a");//carinsurancepath
        sleepFor(15);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //This will scroll the web page till end.
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        clickByXpath("//a[.='auto insurance discounts']");
        sleepFor(8);

        JavascriptExecutor jr = (JavascriptExecutor) driver;
        //This will scroll the web page till end.
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        clickByXpath("//*[@id=\"content\"]/section[3]/div/div/div[2]/div/div/div[3]/div/a[2]");//googlply
        sleepFor(6);
        handleNewTab(driver);

    }


}








    // Action Method






















//lamia code
//    public void dropdown() throws InterruptedException {
//        Select allCategories= new Select(dropDown);
//        allCategories.selectByIndex(3);
//        Thread.sleep(3000);
//    }


//
//    public void dropdowntotal() {
//        Select allCategories = new Select(dropDown);
//        List<WebElement> categoriesList= allCategories.getOptions();
//        int totalCategories= categoriesList.size();
//        Assert.assertEquals(totalCategories, 36);
//        System.out.println("Total categories is "+totalCategories);
//        for(WebElement element: categoriesList){
//            String categoryName= element.getText();
//            System.out.println("categories are: " +categoryName);
//        }
 //   }


















////first commit
//public void searchBox1(){
//    typeOnElement(searchBoxLocator,"Hand Sanitizer");
//    clickOnElement(searchButtonLocator);
//}

   // @FindBy (how = How.LINK_TEXT, using =searchButtonLocator ) public WebElement searchButton1;

//    // Find By Annotation: Second Approach using public
//    @FindBy(id=searchBoxLocator) public WebElement searchBox1;
//    // Find By Annotation: Third Approach using private
//    @FindBy(id=searchBoxLocator) private WebElement searchBox2;
//
//    public WebElement getSearchBox2() {
//        return searchBox2;
//    }
//
//    public void setSearchBox2(WebElement searchBox2) {
//        this.searchBox2 = searchBox2;
//    }
//
//    public void demo(){
//        searchBox.sendKeys("Mask");
//        searchButton.click();
//
//    }


















