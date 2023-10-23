package pages;


import org.openqa.selenium.By;
import webdriver.WebDriver;

public class TestPage {

    public boolean userIsOnBinarPage() {
        return WebDriver.webdriver.findElement(By.xpath("//*[contains(@class,'symbol-newnavbar-img-logo')]")).isDisplayed();
    }

    public void userClickProgramBinar() throws InterruptedException {
        WebDriver.webdriver.findElement(By.xpath("(//div[contains(text(),'Program Binar')])[1]")).click();
        Thread.sleep(2000);
    }

    public boolean userSeeProgramBinar() {
        return WebDriver.webdriver.findElement(By.xpath("//div[contains(text(),'BinarGO!')]")).isDisplayed();
    }

    public void userClickBinarGO() throws InterruptedException {
        WebDriver.webdriver.findElement(By.xpath("(//div[contains(text(),'BinarGO!')])[1]")).click();
        Thread.sleep(3000);
    }
}
