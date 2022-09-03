package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage
{
    //private By
    private Select city;
    private By cityDrp = By.xpath("//select[@class=\"btn dropdown-toggle checkout-dropdown border-radius_Style checkoutDeliveryFamilyFont\"]");
    private String cityValue = "0";
    private Select region;
    private By regionDrp = By.xpath("//select[@class=\"btn dropdown-toggle checkout-dropdown border-radius_Style checkoutDeliveryFamilyFont ng-untouched ng-pristine ng-valid\"]");
    private String regionTxt =  "Ain Shams";
    private By deliverToMyAddressBtn = By.xpath("//div[@class=\"checkout-DelivaryOptionsInfo checkout-DelivaryToAddress open firstOpen\"]");
    private By streetNameTxt = By.xpath("//*[@id=\"checkout-deliveryAdd\"]/div[1]/div[1]/div/div[1]/div/input");
    private By  buildingNumberTxt = By.xpath("//*[@id=\"checkout-deliveryAdd\"]/div[1]/div[1]/div/div[2]/div/input");
    private By  floorNumberTxt = By.xpath("//*[@id=\"checkout-deliveryAdd\"]/div[1]/div[1]/div/div[3]/div/input");
    private By  apartmentNumberTxt = By.xpath("//*[@id=\"checkout-deliveryAdd\"]/div[1]/div[1]/div/div[4]/div/input");
    //private By continueBtn = By.xpath("//button[@class=\"btn checkout-btn btn-red delievry--btn--checkout\"]");
    private By continueBtn = By.xpath("//*[@id=\"checkout-deliveryAdd\"]/div[3]/button");

    public CheckoutPage(WebDriver driver)
    {
        super(driver);
    }
    public void fillUserAddress()
    {
        selectCity();
        selectRegion();
    }
    public void fillUserInfo()
    {
        pressDeliverToMyAddressBtn();
        writeStreetNameTxt();
        writeBuildingNumberTxt();
        writeFloorNameTxt();
        writeApartmentNameTxt();
        pressContinueBtn();
    }
    private void selectCity()
    {
        wait.until(ExpectedConditions.presenceOfNestedElementsLocatedBy(cityDrp,By.tagName("option")));
        city = new Select(driver.findElement(cityDrp));
        city.selectByValue(cityValue);
    }
    private void selectRegion()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(regionDrp));
        region = new Select(driver.findElement(regionDrp));
        region.selectByVisibleText(regionTxt);
    }
    private void pressDeliverToMyAddressBtn()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(deliverToMyAddressBtn));
        driver.findElement(deliverToMyAddressBtn).click();
    }
    private void writeStreetNameTxt()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(streetNameTxt));
        driver.findElement(streetNameTxt).sendKeys("s");
    }
    private void writeBuildingNumberTxt()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(buildingNumberTxt));
        driver.findElement(buildingNumberTxt).sendKeys("1");
    }
    private void writeFloorNameTxt()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(floorNumberTxt));
        driver.findElement(floorNumberTxt).sendKeys("2");
    }
    private void writeApartmentNameTxt()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(apartmentNumberTxt));
        driver.findElement(apartmentNumberTxt).sendKeys("3");
    }
    private void pressContinueBtn()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueBtn));
        driver.findElement(continueBtn).click();
    }
}
