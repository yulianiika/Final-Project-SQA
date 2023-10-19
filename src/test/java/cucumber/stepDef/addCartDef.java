package cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class addCartDef {

    String baseURL = "http://www.saucedemo.com/";
    ChromeOptions op = new ChromeOptions();
    WebDriver driver = new ChromeDriver(op);

    @Given("Success login in web")
    public void successLoginInWeb() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @When("select the product to add to the cart")
    public void selectTheProductToAddToTheCart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }


    @And("tap Add to Cart button")
    public void tapAddToCartButton() {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }

    @Then("CheckOut page")
    public void checkoutPage() {
        driver.findElement(By.className("title"));

    }

    @When("add more than one product")
    public void addMoreThanOneProduct() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
    }
}
