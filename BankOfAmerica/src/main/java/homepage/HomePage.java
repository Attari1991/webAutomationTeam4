package homepage;

import common.WebAPI;
import org.apache.commons.math3.ode.events.EventHandler;
import org.bson.io.BsonOutput;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import static homepage.HomePageWebElement.*;



public class HomePage  extends WebAPI {
    // Action Method class

    // Find By Annotation: First Approach
    //============logo
     @FindBy(how = How.XPATH, using =logoLocator)public WebElement logo;
     //============open Account option
     @FindBy(how = How.XPATH, using =openAnAccountLocator)public WebElement OpenAccount;
     @FindBy(how = How.XPATH, using =thatsFitsYourNeedsLocator)public WebElement thatFitsYourNeeds;
     //========contact us option
     @FindBy(how = How.XPATH, using =contactUsLocator)public WebElement contactUs;
     @FindBy(how = How.XPATH, using =requestAPaymentDeferralLocator)public WebElement RequestAPaymentDeferral;
     @FindBy(how = How.XPATH, using =selectYourDeviceLocator)public WebElement selectYourDevice;
     @FindBy(how = How.XPATH, using =stayFlexibleWithBankOfTextLocator)public WebElement stayFlexibleWithBankOf;
     //=====saving option
     @FindBy(how = How.XPATH, using =onlineBankingLocator)public WebElement onlineBanking;
     @FindBy(how = How.XPATH, using =TakeTextLocator)public WebElement TakeText;
     @FindBy(how = How.XPATH, using =clientInformationTextLocator)public WebElement clientInformationText;
     @FindBy(how = How.XPATH, using =getALowRateOnPurchaseTextLocator)public WebElement getALowRateOnPurchaseText;
     @FindBy(how = How.XPATH, using =selectYourStateLocator)public WebElement selectYourState;





    public void checkLogo(){
        logo.click();
    }

    public void checkContinueToBank(){
        OpenAccount.click();
    }

    public void checkContactUs() throws InterruptedException {
        contactUs.click();
        sleepFor(3);
        clickByXpath1(requestAPaymentDeferralLocator);
        sleepFor(3);
        handleNewTab(driver);
        sleepFor(3);
        clickByXpath(getTheAppLocator);
        sleepFor(3);
        navigateBack();

    }

    public void checkChecking(){
        clickByXpath(checkingLocator);

    }

    public void checkSavings() throws InterruptedException {
        clickByXpath(savingsLocator);
        sleepFor(4);
        onlineBanking.click();
        sleepFor(4);
    }

    public void checkNavigatingTheContinuing() throws InterruptedException {
        sleepFor(4);
        clickByXpath(navigatingTheContinuing);
        sleepFor(4);
        mouseHoverByXpath(creditLocator);
        sleepFor(4);
        clickByXpath1(creditReport);
        sleepFor(4);
    }

    public void checkSeeDetails() throws InterruptedException {
        checkNavigatingTheContinuing();
        Thread.sleep(2000);
        clickByXpath1(seeDetailsLocator);
        Thread.sleep(2000);
        handleNewTab(driver);
    }

    public void checkAutoLoans() throws InterruptedException {
        clickByXpath1(autoLoansLocator);
        sleepFor(3);
    }

    public void checkSmallBusiness() throws InterruptedException {
        clickByCss(smallBusinessLocator);
        Thread.sleep(3000);
    }

    public void checkWealthManagement() throws InterruptedException {
        clickByXpath(wealthMangementLocator);
        Thread.sleep(3000);
    }

    public void checkBusinessesAndIns() throws InterruptedException {
        clickByXpath(businessesAndInstitution);
        sleepFor(4);
    }

    public void checkAboutUs() throws InterruptedException {
      clickByXpath(aboutUsLocator);
        sleepFor(4);
        mouseHoverByXpath(WhoAreWeLocator);
        sleepFor(4);
        clickByXpath(ourStrategyLocator);
        sleepFor(4);
    }


    public void checkSecurity() throws InterruptedException {
        clickByXpath(securityLocator);
        sleepFor(4);
    }

    public void moveToLeft() throws InterruptedException {
        checkSecurity();
        sleepFor(3);
        clickByXpath(moveToLeftLocator);
        sleepFor(4);
    }

    public void checkHelp() throws InterruptedException {
        clickByXpath(helpLocator);
        sleepFor(5);
    }

    public void checkCashBack() throws InterruptedException {
        clickByXpath(cachBackLocator);
        sleepFor(14);
        handleNewTab(driver);
        sleepFor(6);

    }

    public void checkRadioButton() throws InterruptedException {
        clickByXpath(radioButtonLocator);
        sleepFor(4);
    }

    public void checkScheduleApp() throws InterruptedException {
        clickById(scheduleAppointmentLocator);
        sleepFor(3);
    }

    public void checkInvesting() throws InterruptedException {
        clickByCss(investingLocator);
        sleepFor(3);
        clickByCss(closeLocator);
        sleepFor(3);
    }

    public void checkSecurityAndHelp() throws InterruptedException {
        clickByXpath(securityAndHelpLocator);
        sleepFor(3);
        clickByXpath("//*[@id=\"closeSecurityModal\"]");//close x
        sleepFor(3);
    }

    public void cehckDisputeAATMDebitCardTransaction() throws InterruptedException {
        clickByXpath(contactUsLocator);
        sleepFor(4);
        clickByXpath(DisputeAATMDebitCardTransactionLocator);
        sleepFor(4);
        handleNewTab(driver);
        sleepFor(4);
        clickByXpath(LearnMoreAboutOnlineBankingLocator);
        sleepFor(3);
    }

    public void selectYourStateUnderHelp() throws InterruptedException {
        clickByXpath(helpLocator);
        sleepFor(4);
        Thread.sleep(3);
        clickByXpath(selectState);
        Thread.sleep(3);

        WebElement element = driver.findElement(By.xpath(selectState));
        Select sel = new Select(element);
        sel.selectByVisibleText("Pennsylvania");
//    WebElement FirstEle=sel.getFirstSelectedOption();
//        System.out.println("first element "+FirstEle.getText());
        //retrieve all the dropDown values:
//        List<WebElement> listOption = sel.getOptions();
//        for (WebElement webElement : listOption) {
//            System.out.println(webElement.getText());
//        }

        sleepFor(4);
        clickByXpath(goLocator);
    }

























}































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


















