package webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriver {
    public static ChromeDriver webdriver;
    public static void initialize() {
//        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        webdriver = new ChromeDriver(options);

        webdriver.get("https://www.binaracademy.com/");

    }

    public static void quit(){
        webdriver.quit();
    }
}
