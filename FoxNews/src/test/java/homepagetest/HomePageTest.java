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
@Ignore
    @Test(priority = 1)
    public void testCheckUS() throws InterruptedException {
        homePage.checkUS();
        Thread.sleep(2000);
        String expectedText="U.S.";
        String actualText=homePage.USText.getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");

        //assertEqualByXpath(USTextLocator,"U.S.");
    }

    @Ignore
    @Test(priority = 2)
    public void testCheckWatchTv() throws InterruptedException {
        homePage.checkWatchTv();
    }

    @Ignore
    @Test(priority = 3)
    public void testCheckXfinity() throws InterruptedException {
        homePage.checkXfinity();
//        String expectedText="Easy access";
//        String actualText=homePage.xfinityText.getText();
//        Assert.assertEquals(actualText,expectedText,"Product does not match");
        assertEqualByXpath(xfinityTextLocator,"Easy access");
    }

    @Ignore
    @Test(priority = 4)
    public void testCheckBidenLink() throws InterruptedException {
        homePage.checkBidenLink();
        assertEqualByXpath(BidenLinkTextLocator,"Biden approval numbers on immigration sink amid border crisis: poll");
    }


    @Ignore
    @Test(priority = 5)
    public void testCheckMedia() throws InterruptedException {
     homePage.checkMedia();
     assertEqualByXpath(mediaTextLocator,"Media");
    }

    //@Ignore
    @Test(priority = 5)
    public void testCheckIframe2() throws InterruptedException {
        homePage.checkIframe2();
    }

















}





































































