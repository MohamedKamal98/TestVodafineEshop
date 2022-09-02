package PurchaseIphoneProduct;

import basePackage.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

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
    @Given("^first$")
    public void first()
    {
        homePage = new HomePage(this.driver);
        System.out.println("sajgiiasufass");
        homePage.pressEnglishBtn();
    }
    @When("^second$")
    public void second()
    {
        homePage.pressEnglishBtn();
    }

    @Then("^third$")
    public void third()
    {
        homePage.pressEnglishBtn();
    }

}
