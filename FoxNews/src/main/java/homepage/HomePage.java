package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class HomePage  extends WebAPI {
   // turn the string variable  into webElement variable:

   @FindBy (how = How.XPATH, using =USLocator ) public WebElement US;
    @FindBy (how = How.XPATH, using =USTextLocator ) public WebElement USText;

   @FindBy (how = How.XPATH, using =watchTvLocator) public WebElement watchTv;
    @FindBy (how = How.CSS, using =xfinityLocator) public WebElement xfinity;
   @FindBy (how = How.CSS, using =iframWatchTvLocator) public WebElement iframe;
     @FindBy (how = How.XPATH, using =xfinityTextLocator) public WebElement xfinityText;
     //@FindBy (how = How.XPATH, using =iframeBidenLocator) public WebElement IframeBiden;
    @FindBy (how = How.XPATH, using =iframeLocator) public WebElement IframeSpaceX;










    //Action method:
    public void checkUS(){
        US.click();
       //clickByXpath(USLocator);//should use a String variable
    }

    public void checkWatchTv() throws InterruptedException {
        watchTv.click();
        Thread.sleep(3000);
    }

    //iframe
    public void checkXfinity() throws InterruptedException {
        checkWatchTv();
        sleepFor(3);
       // driver.switchTo().frame("#mvpd-picker");\
        iframeHandle(iframe);//474
        Thread.sleep(3000);
        xfinity.click();
        Thread.sleep(9000);
        handleNewTab(driver);//525
    }

    public void checkBidenLink() throws InterruptedException {
        clickByXpath(BidenLinkLocator);
        sleepFor(3);
    }

    public void checkMedia() throws InterruptedException {
        clickByXpath(mediaLocator);
        sleepFor(3);
    }

    public void checkIframe2() throws InterruptedException {
        clickByXpath(spaceXlinkLocator);
        sleepFor(3);
        iframeHandle(IframeSpaceX);
        sleepFor(4);
        clickByXpath(pauseIconLocator);
        sleepFor(4);
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


















