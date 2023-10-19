package cucumber.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutDef {
    addCartDef add = new addCartDef();

    WebDriver driver = add.driver;

    @Given("Add to carta")
    public void addToCart() {
        add.successLoginInWeb();
        add.selectTheProductToAddToTheCart();
        add.tapAddToCartButton();
        add.checkoutPage();
    }

    @Given("Add to cartb")
    public void addToCartb() {
        add.successLoginInWeb();
        add.tapAddToCartButton();
        add.checkoutPage();
    }

    @Given("Add to cartc")
    public void addToCartc() {
        add.successLoginInWeb();
        add.addMoreThanOneProduct();
        add.tapAddToCartButton();
        add.checkoutPage();
    }

    @When("Klik Checkout")
    public void klikCheckout() {
            add.driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    }

    @Then("user on Address page")
    public void userOnAddressPage() {
            add.driver.findElement(By.xpath("//*[@id=\"continue\"]")); // halaman information
        add.driver.close();
        }

}
