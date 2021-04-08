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

    @Test(priority = 1)
    public void TestCheckInsurance() throws InterruptedException {
        homePage.checkInsurance();
        assertEqualByXpath(driverSafeAndSaveLocator,"Drive Safe & Save™");
    }

























}




































































