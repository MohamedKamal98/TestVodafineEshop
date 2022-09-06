package basePackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.DriverSetup;

public class BaseTest extends AbstractTestNGCucumberTests
{
    public static WebDriver driver;
    @BeforeClass
    public void invokeBrowser()
    {
        //driver = DriverSetup.DriverInitiate("chrome");
        driver =  DriverSetup.chromeDriverInitiate();
    }
    @AfterClass
    public void tearDown()
    {
        //this.driver.quit();
    }
}
