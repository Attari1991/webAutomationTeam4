package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.annotations.*;

import java.sql.SQLOutput;
import java.util.List;

import static homepage.HomePageWebElement.*;

public class HomePageTest extends WebAPI {
    // Test class

    HomePage homePage;

    @BeforeMethod
    public void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }


//    @Ignore
    @Test(priority = 1)//(enabled = false)
    public void testSearchBox() throws InterruptedException {
        //getInit();
        // Call Action method by reference variable
        homePage.searchBox();
        // Verify expected vs Actual
        String expectedText="gloves";
        String actualText=homePage.searchText.getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
    }


//    @Ignore
    @Test(priority = 2)//(enabled = false)
    public void testCheckDailyDeals(){
        // Call Action method by reference variable
        homePage.checkDailyDeals();
        // Verify expected vs Actual
        String expectedText="Daily Deals";
        String actualText=homePage.dealsText.getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
    }


//    @Ignore
    @Test(priority = 3)
    public void testShoppingCart(){
      homePage.checkShoppingCart();
       String expectedText="";
        String actualText=homePage.shoppingCart.getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
    }

//    @Ignore
    @Test(priority = 4)
    public void testCheCkAddToCart() throws InterruptedException {
        homePage.checkAddToCart();
        String expectedText="Shopping cart (2 items)";
        String actualText=homePage.itemsAdded.getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
    }


//    @Ignore
    @Test(priority = 5)
    public void testCheckCommentsWin() throws InterruptedException {
        homePage.checkCommentsWin();
        String expectedText="Send Us Your Comments";
        String actualText=homePage.commentsWin.getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
    }


//    @Ignore
    @Test(priority = 6)
    public void testSendComments() throws InterruptedException {
        homePage.sendComments();
        String expectedText="Thank you for helping to improve eBay.";
        String actualText=homePage.Text.getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
    }

//    @Ignore
    @Test(priority = 7)
    public void testcheckBooks() throws InterruptedException {
        homePage.checkBooks();
        String expectedText="Books";
        String actualText=homePage.books.getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
    }

//    @Ignore
    @Test(priority = 8)
    public void  testcheckEverythingElse1() throws InterruptedException {
        homePage.checkEverythingElse();
        String expectedText="Everything Else";
        String actualText=homePage.everythingElse.getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
    }


//    @Ignore
    @Test(priority = 9)
    public void testCheckMyEbay() throws InterruptedException {
        homePage.checkMyEbay();
        String expectedText="Selling";
        String actualText=homePage.selling.getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
    }

//    @Ignore
    @Test(priority = 10)
    public void testAllCategoriesList() throws InterruptedException {
        homePage.allCategoriesList();
        assertEqualByXpath("//*[@id=\"gh-cat\"]/option[3]","Art");
    }

//    @Ignore
    @Test(priority = 11)
    public void testmotors() throws InterruptedException {
        homePage.motors();
        assertEqualByXpath("/html/body/div[3]/div[2]/h1","Boats");
    }

//   @Ignore
    @Test(priority = 12)
    public void testCheckAdvanced() throws InterruptedException {
        homePage.checkAdvanced();
        assertEqualByXpath(advancedSearchLocator,"Advanced Search");
    }

//    @Ignore
    @Test(priority = 13)
    public void testSelectElmFromAdvanced() throws InterruptedException {
        homePage.selectElmFromAdvanced();
        assertEqualByXpath(advancedSearchLocator,"Advanced Search");

    }

//   @Ignore
    @Test(priority = 14)
    public void testcheckSellYourKicks() throws InterruptedException {
        homePage.checkSellYourKicks();
       assertEqualByXpath(SellYourKicksLocator,"");
    }
//    @Ignore
    @Test(priority = 15)
    public void testClickOnImage(){
        homePage.clickOnImage();
        assertEqualByXpath("//*[@id=\"refit-spf-container\"]/div[1]/h1/a","Deals");//Deals xpath
    }

//    @Ignore
    @Test(priority = 16)
    public void testcheckSaved() throws InterruptedException {
        homePage.checkSaved();
        assertEqualByXpath(savedLocator,"Saved");
    }

//    @Ignore
    @Test(priority = 17)
    public void testCheckFashion() throws InterruptedException {
        homePage.checkFashion();
        assertEqualByXpath("/html/body/div[3]/div[2]/h1/span","Health");//HealthText xpath
    }

//    @Ignore
    @Test(priority = 18)
    public void testCheckElectronics() throws InterruptedException {
        homePage.checkElectronics();
        assertEqualByXpath("/html/body/div[3]/div[2]/nav/ol/li[3]/span","Laptops & Netbooks");//HealthText xpath
    }

//    @Ignore
    @Test(priority = 19)
    public void testMoveToRigth() throws InterruptedException {
        homePage.movetoRigth();
        assertEqualByXpath(moveToRightLocator,"");
    }

//    @Ignore
    @Test(priority = 20)
    public void testSignIn() throws InterruptedException {
     homePage.signIn();
   assertEqualByXpath("#pass","");
    }

//    @Ignore
    @Test(priority = 21)
    public void testCheckSeeAll(){
        homePage.checkseeAll();
        assertEqualByXpath(sportingGoodsLocator,"Sporting Goods");
    }

//    @Ignore
    @Test(priority = 22)
    public void testCheckMusic() throws InterruptedException {
        homePage.checkMusic();
        assertEqualByXpath(musicTextLocator,"Music");
    }



//    @Ignore
    @Test(priority = 23)
    public void testCheckCountries() throws InterruptedException {
        homePage.checkCountries();
       assertEqualByXpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]","Sell\n" +
               "Start selling\n" +
               "How to sell\n" +
               "Business sellers\n" +
               "Affiliates\n" +
               "Tools & apps\n" +
               "Developers\n" +
               "Security center\n" +
               "eBay official time\n" +
               "Site map");//france
    }

//   @Ignore
    @Test(priority = 24)
    public void testCheckShopByCategory() throws InterruptedException {
        homePage.checkShopByCategory();
        assertEqualByXpath(collectioniblesAndArtTextLocator,"Collectibles & Art");
    }

//    @Ignore
    @Test(priority = 25)
    public void testCheckHomeAndGarden() throws InterruptedException {
       homePage.checkHomeAndGarden();
       //assertEqualByXpath(toolsTextLocator, "Tools & Workshop Equipment");
   }


    @Test
    public void testSearchElementUsingExcel() throws Exception {
        homePage.SearchElementUsingExcel();
        String expectedTitle="Mens shirt | eBay";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title does not match");
    }



    @Test
    public void testSearchElementUsingDatabses() throws Exception {
        homePage.SearchElementUsingDataBases();
        String expectedTitle="Mens shirt | eBay";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title does not match");
    }


























}





































































