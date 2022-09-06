package basePackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;
import utilities.DriverSetup;

public class BaseTest extends AbstractTestNGCucumberTests
{
    public static WebDriver driver;
    public static SoftAssert softAssert;
    @BeforeClass
    public void invokeBrowser()
    {
        //driver = DriverSetup.DriverInitiate("chrome");
        driver =  DriverSetup.chromeDriverInitiate();
        softAssert = new SoftAssert();
    }
    @AfterClass
    public void tearDown()
    {
        //this.driver.quit();
    }
}
