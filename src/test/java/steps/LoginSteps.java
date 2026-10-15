
package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;

import page.LoginPage;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
    }

    @When("user input username with {string}")
    public void userInputUsernameWith(String username) {
        loginPage.inputUsername(username);
    }

    @When("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginPage.inputPassword(password);
    }

    @When("user input very long username")
    public void userInputVeryLongUsername() {
        String username = "a".repeat(500);
        loginPage.inputUsername(username);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        Assert.assertTrue(
                "Login failed: homepage was not displayed",
                driver.getCurrentUrl().contains("inventory.html")
        );

        driver.quit();
    }

    @Then("user able to see error message")
    public void userAbleToSeeErrorMessage() {
        String errorMessage = loginPage.getErrorMessage();

        Assert.assertNotNull(
                "Error message should not be null",
                errorMessage
        );

        Assert.assertFalse(
                "Error message should not be empty",
                errorMessage.isEmpty()
        );

        driver.quit();
    }

}
