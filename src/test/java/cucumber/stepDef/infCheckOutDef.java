package cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class infCheckOutDef {

    CheckOutDef cek = new CheckOutDef();
    WebDriver driver = cek.driver;
    @Given("Checkouta")
    public void checkouta() {
        cek.addToCart();
        cek.klikCheckout();
    }

    @And("Input Your Information")
    public void inputYourInformation() {
        driver.findElement(By.id("first-name")).sendKeys("ika");
        driver.findElement(By.id("last-name")).sendKeys("ika");
        driver.findElement(By.id("postal-code")).sendKeys("1234");
    }

    @And("klik Continue button")
    public void klikContinueButton() {
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    }

    @When("Checkoutb")
    public void checkoutb() {
        cek.addToCartb();
        cek.klikCheckout();
    }

    @When("Checkoutc")
    public void checkoutc() {
        cek.addToCartc();
        cek.klikCheckout();
    }

    @Then("user on Overview page")
    public void userOnOverviewPage() {
        driver.findElement(By.xpath("//*[@id=\"finish\"]"));
    }

}
