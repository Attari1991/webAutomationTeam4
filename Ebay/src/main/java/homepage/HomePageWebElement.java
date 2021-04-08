package homepage;

import org.openqa.selenium.By;

public class HomePageWebElement {
    // WebElement class for Locators only and some other properties

    public static final String productName="gloves";
    public static final String searchBoxLocator="gh-ac";
    public static final String searchButtonLocator="gh-btn";
    public static final String searchTextLocator="//*[@id='mainContent']//span[text()='gloves']";
    public static final String dailyDealsLocator="//*[@id=\"gh-p-1\"]/a";
    public static final String dealsTextLocator="//*[@id=\"gh-p-1\"]/a";
    public static final String cartLocator="//*[@id=\"gh-minicart-hover\"]/div/a[1]";

    //===================================================
    //add gloves To Cart element locators:

    public static final String blackGlovesLocator="//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3";

    //public static final String blackGlovesTextLocator="//*[@id=\"itemTitle\"]";

    public static final String glovesSizeBoxLocator="//*[@id=\"itemTitle\"]";
    public static final String glovesSizeLocator="//*[@id=\"msku-opt-1\"]";
    public static final String packSizeBoxLocator="//*[@id=\"msku-sel-2\"]";
    public static final String packSizeLocator="//*[@id=\"msku-opt-2\"]";
    public static final String bulkSavingBOXLocator="//*[@id=\"vi-vpqp-pills-1\"]";
    public static final String AddToCartLocator="//*[@id=\"atcRedesignId_btn\"]";
    public static final String goToCartLocator="//*[@id=\"atcRedesignId_overlay-atc-container\"]/div/div[1]/div/div[3]/a[2]";
    public static final String itemsTextLocator="//*[@id=\"mainContent\"]/div/div[1]/h1";

    //===============================================send comment to ebay about item

     public static final String commentsWinLocator="//*[@id=\"survey-link\"]/span/a";
     public static final String SuggestionOptionLocator="//div[@id='undefined']//*[contains(text(),'suggestion')]";
     public static final String commentsBoxLocator="//*[@id=\"qid_3\"]";
     public static final String sendLocator="//*[@id=\"submitFdbk\"]";
     public static final String textLocator="//h1[.='Thank you for helping to improve eBay.']";

     //===============================================All categories===>everything else
    public static final String allCategoriesLocator ="//*[@id=\"gh-cat\"]";
     public static final String booksLocator="//*[@id=\"gh-cat\"]/option[5]";
     public static final String everythingElseLocator="//*[@id=\"gh-cat\"]/option[36]";
     //==================My ebay option

     public static final String myEbayLocator="//*[@id=\"gh-eb-My\"]/div/a[1]";
     public static final String sellingLocator="//*[@id=\"gh-eb-My-o\"]/ul/li[7]/a";
     public static final String messageTextLocator="//*[@id=\"gh-cat\"]";

     //==============================================motors options

     public static final String motorsLocator ="//*[@id=\"mainContent\"]/div[1]/ul/li[3]";
     public static final String boatsLocator ="//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[7]/a";

     //================================================advanced option
     public static final String advancedLocator ="//a[@id='gh-as-a']";
     public static final String advancedSearchLocator ="//*[@id=\"gh-title\"]";
    public static final String allWordBoxLocator ="#_in_kw";//css
    public static final String exactWordLocator ="//*[@id=\"_in_kw\"]";
    public static final String SellYourKicksLocator ="//*[@id=\"gh-hsi\"]";
    public static final String clickOnImageLocator ="//*[@id=\"s0-0-31-3-0-0[0]-2-match-media-0-ebay-carousel-list\"]/li[1]/div/div[2]/div/div[2]/div[1]/a/div/img";

    //===============
    public static final String savedLocator ="//li[@class='saved']";//xpath//#mainContent > div.hl-cat-nav > ul > li.saved";//css
     public static final String savedTextLocator ="//div[@class='follow-dropdown-label']";//xpath

    //======================hover by css
    public static final String fashionLocator ="li[data-hover-track='p2481888.m1380.l6435']";//xpath
    public static final String healthLocator ="//a[.='Health']";//xpath
    public static final String electronicsLocator ="body > div:nth-child(10) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(5)";//css
    public static final String laptopsLocator ="//a[.='Laptops']";//xpath
    //=========================
    public static final String slideShowLocator ="//*[@id=\"s0-0-31-3-0-0[0]-2-match-media-0-ebay-carousel-list\"]/li[1]/div/div[1]";//xpath
     public static final String buttonRigthLocator ="//*[@id=\"s0-0-31-3-0-0[0]-2-match-media-0-ebay-carousel-next\"]";
     public static final String moveToRightLocator ="//div[@class='carousel hl-carousel carousel--slides carousel__autoplay']//button[@class='carousel__control carousel__control--next']";
      public static final String sportingGoodsLocator ="/html/body/div[3]/div[2]/nav/ol/li[2]/span";
      //===============================
       public static final String musicTextLocator ="//h1[@class='title-banner__title']";
       public static final String popularOnEbayLocator ="#destinations_list1 > div > div > div.hl-card-header__title > h2 > a > font > font";
   //================
    public static final String shopByCategoryLocator ="//*[@id=\"gh-shop-a\"]";
     public static final String CollectiblesAndArtLocator ="//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/h3[1]/a";
     public static final String collectioniblesAndArtTextLocator="//span[@class='b-breadcrumb__text b-link--tertiary truncate']";//xpath
    //===========home AND garden
    public static final String homeAndGardenLocator="//*[@id=\"mainContent\"]/div[1]/ul/li[7]";//xpath
     public static final String toolsLocator="//*[@id=\"mainContent\"]/div[1]/ul/li[7]/div[2]/div[1]/nav[1]/ul/li[1]/a";//xpath
    public static final String toolsTextLocator="/html/body/div[3]/div[2]/nav/ol/li[3]/span";//xpath


//    //=====sign in by using data proidor
//    public static final String uNameLocator="userid";//id
//    public static final String emailBoxLocator="//*[@id=\"signin-form\"]/div[1]/div/div/label";//x
//     public static final String pwLocator="pass";//id
//    public static final String pwboxLocator="//*[@id=\"pass\"]";//x
//     public static final String signInButtonLocator="//*[@id=\"sgnBt\"]";//x





















































































}
