package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Regsteps {
    WebDriver driver;
    @And("^I re-enter password$")
    public void iReEnterPassword() {
        driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("Mimodog22");
    }

    @And("^I click create your amazon account$")
    public void iClickCreateYourAmazonAccount() {
        driver.findElement(By.id("createAccountSubmit")).click();
    }

    @Given("^I navigate to Amazon site$")
    public void i_navigate_to_amazon_site() {
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://www.amazon.co.uk/");
    }

    @And("^I click on Hello, Sign in$")
    public void iClickOnHelloSignIn() {
        driver.findElement(By.xpath("//span[text()= 'Hello, Sign in']")).click();
    }

    @When("^I enter name$")
    public void iEnterName() {
       driver.findElement(By.xpath("//*[@name='customerName']")).sendKeys("Dodo");
    }

    @And("^I enter email$")
    public void iEnterEmail() {
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("dodome232@gmail.com");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Mimodog22");
    }

    @Then("^I click on create account$")
    public void iClickOnCreateAccount() {
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

    }

    @And("^I confirm that Verify e-mail address is displayed$")
    public void iConfirmThatVerifyEMailAddressIsDisplayed() {
        String verifyYourEmailMessage = driver.findElement(By.xpath("//h1[contains(text(), 'Verify e-mail address')]")).getText();
        Assert.assertEquals(verifyYourEmailMessage,"Verify e-mail address");



    }

    @Then("^I close my window$")
    public void iCloseMyWindow() {
        driver.quit();

    }
}
