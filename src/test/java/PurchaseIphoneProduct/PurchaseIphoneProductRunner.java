package PurchaseIphoneProduct;

import basePackage.BaseTest;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions (glue = "PurchaseIphoneProduct",
        features = "src/test/java/PurchaseIphoneProduct")
public class PurchaseIphoneProductRunner extends BaseTest
{

}
