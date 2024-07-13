package Annotation;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLoginSteps {
    ChromeDriver driver  ;

    @Before
    public void setUp(){
        String ChromePath = System.getProperty("user.dir") + "\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",ChromePath);
        driver = new ChromeDriver();
    }

    @Given("Navigate t]o home page of Orangehrmlive")
    public void navigate_to_home_page_of_orangehrmlive() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        throw new io.cucumber.java.PendingException();
    }

    @When("I enter username as Admin")
    public void i_enter_username_as_admin(String userName) {
        driver.findElement(By.id("username")).sendKeys(userName);
        throw new io.cucumber.java.PendingException();
    }

    @When("I enter password as admin123")
    public void i_enter_password_as_admin123(String Password) {
        driver.findElement(By.id("password")).sendKeys(Password);
        driver.findElement(By.id("login")).click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("login should be successful")
    public void login_should_be_successful() {
        if(driver.getCurrentUrl().equalsIgnoreCase(
                "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        throw new io.cucumber.java.PendingException();
    }
}