package hooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class MyHooks {
    private WebDriver driver;

    @Before
    public void setupDriver(){
        driver= DriverFactory.initializeDriver();
    }

    @After
    public void closeDriver(){
        if (driver !=null){
            driver.close();
        }
    }
}
