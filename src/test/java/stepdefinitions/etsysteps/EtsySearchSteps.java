package stepdefinitions.etsysteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.etsypages.EtsyHomePage;
import utils.Driver;

public class EtsySearchSteps {
    WebDriver driver= Driver.getDriver();
    EtsyHomePage etsyHomePage=new EtsyHomePage(driver);
    @Given("the user navigates to {string}")
    public void the_user_navigates_to(String url) {
      driver.get(url);


    }
    @When("the user searches with {string}")
    public void the_user_searches_with(String value) {
        etsyHomePage.sendSearchKey(value);

    }
    @Then("the user validates the title {string}")
    public void the_user_validates_the_title(String expectedTitle) {
        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }

}
