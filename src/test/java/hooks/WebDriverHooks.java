package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import webdriver.WebDriver;

public class WebDriverHooks {

    @Before(value = "@Web")
    public void initializeWebDriver(){
        WebDriver.initialize();
    }

    @After(value = "@Web")
    public void after(){
        WebDriver.quit();
    }
}
