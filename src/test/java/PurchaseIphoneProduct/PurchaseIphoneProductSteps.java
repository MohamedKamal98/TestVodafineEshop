package PurchaseIphoneProduct;

import basePackage.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.DriverSetup;

public class PurchaseIphoneProductSteps extends BaseTest
{
    HomePage homePage;

    /*
    @Given("^User opens vodafone eshop Home Page with English Language$")
    public void User_opens_vodafone_eshop_Home_Page_with_English_Language()
    {
        homePage.pressEnglishBtn();
    }
     */


    @Given("User opens vodafone eshop Home Page")
    public void userOpensVodafoneEshopHomePage()
    {
        this.driver = DriverSetup.DriverInitiate("chrome");
        homePage = new HomePage(this.driver);
    }

    @And("User Choose English Language")
    public void userChooseEnglishLanguage()
    {
        homePage.pressEnglishBtn();
    }

    @When("User selects iphone products")
    public void userSelectsIphoneProducts()
    {
    }

    @And("User added a product to basket")
    public void userAddedAProductToBasket()
    {
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
