package steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TestPage;

public class TestSteps {
    TestPage testPage = new TestPage();

    @Given("User is on binar page")
    public void userIsOnBinarPage() {
        Assert.assertTrue(testPage.userIsOnBinarPage());
    }

    @When("User click Program Binar")
    public void userClickProgramBinar() throws InterruptedException {
        testPage.userClickProgramBinar();
    }

    @Then("User see Program Binar")
    public void userSeeProgramBinar() {
        Assert.assertTrue(testPage.userSeeProgramBinar());
    }

    @And("User click Binar GO!")
    public void userClickBinarGO() throws InterruptedException {
        testPage.userClickBinarGO();
    }
}
