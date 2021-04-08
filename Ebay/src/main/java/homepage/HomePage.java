package homepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import java.util.List;

import static homepage.HomePageWebElement.*;

public class HomePage  extends WebAPI {
    // Action Method class

    // Find By Annotation: First Approach
    @FindBy (how = How.ID, using =searchBoxLocator ) public WebElement searchBox;
    @FindBy (how = How.ID, using =searchButtonLocator ) public WebElement searchButton;
    @FindBy (how = How.XPATH, using =searchTextLocator ) public WebElement searchText;
   @FindBy (how = How.XPATH, using =dailyDealsLocator ) public WebElement dailyDeals ;
    @FindBy (how = How.XPATH, using =dealsTextLocator ) public WebElement dealsText ;
    @FindBy (how = How.XPATH, using =cartLocator ) public WebElement shoppingCart;
    @FindBy (how = How.XPATH, using =blackGlovesLocator) public WebElement blackGloves;
    //@FindBy (how = How.XPATH, using =blackGlovesTextLocator) public WebElement blackGlovesText;
    @FindBy (how = How.XPATH, using =glovesSizeBoxLocator) public WebElement glovesSizeBox;
    @FindBy (how = How.XPATH, using =glovesSizeLocator) public WebElement glovesSize;
    @FindBy (how = How.XPATH, using =packSizeBoxLocator) public WebElement packSizeBox;
    @FindBy (how = How.XPATH, using =packSizeLocator) public WebElement packSize;
    @FindBy (how = How.XPATH, using =bulkSavingBOXLocator) public WebElement bulkSaving;
    @FindBy (how = How.XPATH, using =AddToCartLocator) public WebElement addToCart;
     @FindBy (how = How.XPATH, using =goToCartLocator) public WebElement goToCart;
     @FindBy (how = How.XPATH, using =itemsTextLocator) public WebElement itemsAdded;
     @FindBy (how = How.XPATH, using =commentsWinLocator) public WebElement commentsWin;
     @FindBy (how = How.XPATH, using =SuggestionOptionLocator) public WebElement suggestionOption;
     @FindBy (how = How.XPATH, using =commentsBoxLocator) public WebElement commentsBox;
      @FindBy (how = How.XPATH, using =sendLocator) public WebElement sendOption;
      @FindBy (how = How.XPATH, using =textLocator) public WebElement Text;
        @FindBy (how = How.XPATH, using =booksLocator) public WebElement books;
        @FindBy (how = How.XPATH, using =everythingElseLocator) public WebElement everythingElse;
        @FindBy (how = How.XPATH, using =myEbayLocator) public WebElement myEbay;
        @FindBy (how = How.XPATH, using =sellingLocator) public WebElement selling;
        @FindBy (how = How.XPATH, using =messageTextLocator) public WebElement messagesText;
    @FindBy (how = How.XPATH, using =allCategoriesLocator) public WebElement allCategories;
    @FindBy (how = How.XPATH, using =motorsLocator) public WebElement motors;
     @FindBy (how = How.XPATH, using =boatsLocator) public WebElement boats;
      @FindBy (how = How.XPATH, using =advancedLocator) public WebElement advanced;
      @FindBy (how = How.XPATH, using =exactWordLocator) public WebElement exactWord;
       @FindBy (how = How.XPATH, using =savedTextLocator) public WebElement savedText;
       @FindBy (how = How.XPATH, using =fashionLocator) public WebElement fashion;
        @FindBy (how = How.XPATH, using =healthLocator) public WebElement health;
         @FindBy (how = How.XPATH, using =electronicsLocator) public WebElement electronics;
         @FindBy (how = How.XPATH, using =laptopsLocator )public WebElement laptops;
         @FindBy (how = How.XPATH, using =sportingGoodsLocator )public WebElement sportingGoods;
         @FindBy (how = How.XPATH, using =musicTextLocator )public WebElement musicText;
         //===shopbycategory
         @FindBy (how = How.XPATH, using =CollectiblesAndArtLocator )public WebElement collectionAndArt;
           @FindBy (how = How.XPATH, using =collectioniblesAndArtTextLocator )public WebElement collectionAndArtText;
           //==========home And garden
         @FindBy (how = How.XPATH, using =homeAndGardenLocator )public WebElement homeAndGarden;
         @FindBy (how = How.XPATH, using =toolsLocator )public WebElement tools;

         @FindBy (how = How.XPATH, using =toolsTextLocator )public WebElement toolsText;






















    // Action Method


    public void searchBox() throws InterruptedException {
        // Enter productName
        searchBox.sendKeys(productName);
        Thread.sleep(1000);
        // Click on searchButton
        searchButton.click();
    }


    public void checkDailyDeals(){
      // dailyDeals.click();
        //by using A method from webAPI
        clickByXpath("//*[@id=\"gh-p-1\"]/a");

    }

    public void checkShoppingCart(){
        shoppingCart.click();
    }

    public void checkAddToCart() throws InterruptedException {
        searchBox();
        Thread.sleep(2000);
        blackGloves.click();
        glovesSizeBox.click();
        glovesSize.click();
        packSizeBox.click();
        packSize.click();
        bulkSaving.click();
        addToCart.click();
        goToCart.click();
        itemsAdded.click();
        Thread.sleep(1000);

    }

    public void checkCommentsWin() throws InterruptedException {
        checkShoppingCart();
        sleepFor(5);
        commentsWin.click();
    }

    public void sendComments() throws InterruptedException {
        checkCommentsWin();
        handleNewTab(driver);
        sleepFor(5);
        suggestionOption.click();
        sleepFor(5);
        commentsBox.sendKeys("i am just testing the comment option on your webSite");
        sleepFor(5);
        sendOption.click();
        sleepFor(2);
        //navigateBack();

    }

    public void checkAllCategories() throws InterruptedException {
        sleepFor(3);
        clickByXpath(allCategoriesLocator);
        sleepFor(3);
    }
//=======================
    public void checkBooks() throws InterruptedException {
        checkAllCategories();
       selectOptionByVisibleText(allCategories,"Books");
       sleepFor(6);
    }

    public void DropDown(String locator12,String value){
        WebElement element =driver.findElement(By.xpath(locator12));
        Select sel=new Select(element);
        sel.selectByVisibleText(value);
    }

     public void checkEverythingElse() throws InterruptedException {
         checkBooks();
         DropDown(allCategoriesLocator,"Everything Else");
     }
//write by me
    public void HoverAndClick(WebElement elementToHover,WebElement elementToClick){
        Actions action = new Actions(driver);
        action.moveToElement(elementToHover).click(elementToClick).build().perform();
    }

    public void checkMyEbay() throws InterruptedException {
        mouseHoverByXpath(myEbayLocator);
        Thread.sleep(3);
        //HoverAndClick(myEbay,messages);
        clickByXpath(sellingLocator);
        Thread.sleep(3);
    }
//retrieve all the dropDown values:
    public void allCategoriesList() throws InterruptedException {
        Thread.sleep(3);
        clickByXpath(allCategoriesLocator);
        Thread.sleep(3);

        WebElement element = driver.findElement(By.xpath(allCategoriesLocator));
        Select sel = new Select(element);
        sel.selectByVisibleText("Art");
//    WebElement FirstEle=sel.getFirstSelectedOption();
//        System.out.println("first element "+FirstEle.getText());
        //retrieve all the dropDown values:
        List<WebElement> listOption = sel.getOptions();
        for (WebElement webElement : listOption) {
            System.out.println(webElement.getText());
        }
    }

    public void motors() throws InterruptedException {
        Thread.sleep(5);
        mouseHoverByXpath(motorsLocator);
        Thread.sleep(3);
        //HoverAndClick(myEbay,messages);
        clickByXpath(boatsLocator);
        Thread.sleep(3);


    }
    public void checkAdvanced() {
        clickByXpath(advancedLocator);
    }

    public void selectElmFromAdvanced() throws InterruptedException {
        checkAdvanced();
        Thread.sleep(3000);
        clickByCss(allWordBoxLocator);
        Thread.sleep(3000);
        //select value from Dropdown using webDriver:
        WebElement element = driver.findElement(By.xpath(exactWordLocator));
        Thread.sleep(2000);
        Select sel = new Select(element);
        Thread.sleep(2000);
        sel.selectByVisibleText("Exact words, any order");//this is the value
        //get the value as first element:
    WebElement FirstEle=sel.getFirstSelectedOption();
        System.out.println("first element "+FirstEle.getText());
        //retrieve all the dropDown values:
        //getListOfWebElementsByXpath(exactWordLocator);//not working
        List<WebElement> listOption = sel.getOptions();
        for (WebElement webElement : listOption) {
            System.out.println(webElement.getText());
        }
    }

    public void checkSellYourKicks() throws InterruptedException {
        clickByXpath(SellYourKicksLocator);
        sleepFor(2);
    }
    public void clickOnImage(){
        clickByXpath1(clickOnImageLocator);
    }
    public void checkSaved() throws InterruptedException {
        clickByXpath(savedLocator);
        sleepFor(6);
    }

//using mouse hover by css
    public void checkFashion() throws InterruptedException {
        Thread.sleep(3);
            mouseHoverByCSS(fashionLocator);
            Thread.sleep(3);
           health.click();
        Thread.sleep(10);
    }

    public void checkElectronics() throws InterruptedException {
        Thread.sleep(3);
        mouseHoverByCSS(electronicsLocator);
        Thread.sleep(3);
        laptops.click();
        Thread.sleep(10);
    }

    public void movetoRigth() throws InterruptedException {
        sleepFor(3);
        clickByXpath(moveToRightLocator);
        sleepFor(3);
    }

    public void signIn() throws InterruptedException {
        clickByXpath("//*[@id=\"gh-ug\"]/a");//signIn
       typeOnInputBox("#userid","ghaniattari95@gmail.com");//css
       clickByXpath("//*[@id=\"signin-continue-btn\"]");
        typeOnInputBox("#pass","meziani199");//pw not correct//css
    }

    public void checkseeAll(){
        clickByXpath("//*[@id=\"destinations_list1\"]/div/div/div[2]/a");
    }

    public void checkMusic() throws InterruptedException {
        sleepFor(3);
        mouseHoverByXpath("//*[@id=\"mainContent\"]/div[1]/ul/li[11]");
        sleepFor(5);
        clickByXpath("//*[@id=\"mainContent\"]/div[1]/ul/li[11]/div[2]/div[2]/div/map/area");
        sleepFor(5);
    }

    public void checkCountries() throws InterruptedException {
    mouseHoverByXpath("//*[@id=\"gf-fbtn\"]");
    }

    public void checkShopByCategory() throws InterruptedException {
        Thread.sleep(3000);
        clickByXpath(shopByCategoryLocator);
        Thread.sleep(3000);
        collectionAndArt.click();
        Thread.sleep(3000);
    }

    public void checkHomeAndGarden() throws InterruptedException {
       mouseHoverByXpath(homeAndGardenLocator);
       sleepFor(4);
       clickByXpath(toolsLocator);
       //tools.click();
        sleepFor(4);
    }
















//    @DataProvider(name="testdata")
//    public Object[] testChrome(String uName, String password)  throws InterruptedException{
//        //clear email box
//        clearInputField(uNameLocator);//id
//        //enter email
//        typeByXpath(emailBoxLocator,uName);//xpath
//        //clear pw box
//        clearInputField(pwLocator);//id
//        //enterPW
//        typeByXpath(pwboxLocator,password);//xpath
//        clickByXpath(signInButtonLocator);
//
//
//        sleepFor(5);
//
//
//        return new Object[0];
//    }
//    @DataProvider(name="testdata")




























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


















