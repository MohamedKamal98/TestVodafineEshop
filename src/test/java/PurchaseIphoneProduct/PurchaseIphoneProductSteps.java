package PurchaseIphoneProduct;

import basePackage.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AppleWatchNikeSEGPS44mmPage;
import pages.HomePage;
import pages.IphoneProductsPage;
import utilities.DriverSetup;

public class PurchaseIphoneProductSteps extends BaseTest
{
    HomePage homePage;
    IphoneProductsPage iphoneProductsPage;
    AppleWatchNikeSEGPS44mmPage appleWatchNikeSEGPS44mmPage;


    @Given("User opens vodafone eshop Home Page")
    public void userOpensVodafoneEshopHomePage()
    {
        this.driver = DriverSetup.DriverInitiate("chrome");
        homePage = new HomePage(this.driver);
        Assert.assertEquals(driver.getTitle(),"Vodafone Shop");
    }

    @And("User Choose English Language")
    public void userChooseEnglishLanguage()
    {
        homePage.pressEnglishBtn();
    }

    @When("User selects iphone products")
    public void userSelectsIphoneProducts()
    {
        homePage.pressIphoneBrandBtn();
        iphoneProductsPage = new IphoneProductsPage(this.driver);
    }

    @And("User select a product")
    public void userSelectAProduct()
    {
        iphoneProductsPage.selectAppleWatchNikeSEGPS44mm();
        appleWatchNikeSEGPS44mmPage = new AppleWatchNikeSEGPS44mmPage(this.driver);
        Assert.assertEquals(appleWatchNikeSEGPS44mmPage.getProductTitle(),"Apple Watch Nike SE GPS, 44mm");
    }

    @And("User added a product to basket")
    public void userAddedAProductToBasket()
    {
        appleWatchNikeSEGPS44mmPage.PressAddToBasketBtn();
    }

    @And("User Checkout")
    public void userCheckout()
    {
    }

    @And("User entered Address")
    public void userEnteredAddress()
    {
    }

    @And("User entered personal info")
    public void userEnteredPersonalInfo()
    {
    }

    @Then("Product is placed successfully")
    public void productIsPlacedSuccessfully()
    {
    }


}
