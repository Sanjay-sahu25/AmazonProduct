package stepdefinitions;

import PageObjects.LandingPage;
import PageObjects.SignOutPage;
import TestComponents.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class StepDefinitionImpl extends BaseTest {
    public LandingPage landingPage;
    public SignOutPage signOutPage;
    @Given("I landed on Ecommerce Page")
    public void I_landed_on_Ecommerce_Page() throws IOException {
        landingPage = launchApplication();
    }
    @Given("^Logged in with username (.+) and password (.+)$")
    public void Logged_in_username_and_password(String name, String password)
    {

         signOutPage = landingPage.LoginApplication(name, password);


    }
    @When()
    @Then("Sign out of the page")
    public void Sign_out_of_the_page()
    {
        signOutPage.SignOut();
        driver.quit();
    }

}
