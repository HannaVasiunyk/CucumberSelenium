package skelet;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    protected static ChromeDriver driver;


    @Given("^I open google page$")
    public void openGooglePage() {
        String webDriverPath = System.getenv("ChromWebdriver");
        System.out.println("webdriver" + webDriverPath);
        System.setProperty("webdriver.chrome.driver", webDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com.ua");

    }

    @Then("^I click on \"Мені пощастить\" button$")
    public void clickOnButton() {
        WebElement button = driver.findElementByCssSelector(".FPdoLc [value='Мені пощастить']");
        button.click();
    }

    @And("^I verify that the date is present$")
    public boolean iVerifyThatTheDateIsPresent() {
        WebElement date = driver.findElementById("latest-tag");
        if (date != null) {
            return true;
        } else {
            return false;
        }
    }

    @Then("^Close chrome$")
    public void closeChrome() {
        driver.close();
        driver.quit();
    }
}
