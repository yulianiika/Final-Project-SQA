package cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDef {
    WebDriver driver; //set driver for test using webdriver from selenium
    String baseURL ="http://www.saucedemo.com/";

    @Given("open link in browser")
    public void openLinkInBrowser() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @When("input registered username")
    public void inputRegisteredUsername() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

    }

    @And("input registered password")
    public void inputRegisteredPassword() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

    }

    @And("tap Login button")
    public void tapLoginButton() {
        driver.findElement(By.id("login-button")).click();

    }

    @Then("open dashboard page")
    public void openDashboardPage() {
        driver.findElement(By.id("react-burger-menu-btn"));

    }

    @When("input a unregistered user")
    public void inputAUnregisteredUser() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user1");
    }

    @Then("User get error")
    public void userGetError() {
        driver.findElement(By.className("error-button"));

    }

    @Given("I open link in browser")
    public void iOpenLinkInBrowser() {
            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(baseURL);
    }

    @When("I input (.*) as username$")
    public void iInputUsernameAsUsername(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("I input (.*) as password$")
    public void iInputPasswordAsPassword(String pass) {
        driver.findElement(By.id("password")).sendKeys(pass);
    }

    @And("I tap Login button")
    public void iTapLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }
    @Then("I Verify (.*) login result$")
    public void iVerifyStatusLoginResult(String status) {
        if(status.equals("success")){
            driver.findElement(By.id("react-burger-menu-btn"));
        } else {
            driver.findElement(By.className("error-button"));
        }
        driver.close();
    }


}
