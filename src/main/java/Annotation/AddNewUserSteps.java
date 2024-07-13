package Annotation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class AddNewUserSteps {
    ChromeDriver driver;
    WebElement addButton;
    @FindBy(id="EmployeeNameTxt")
    WebElement EmployeeNameTxt ;
    @FindBy(id="userNameTxt")
    WebElement userNameTxt ;
    @FindBy(id="passwordTxt")
    WebElement passwordTxt ;
    @FindBy(id="confirmPasswordTxt")
    WebElement confirmPasswordTxt ;
    WebElement saveButton;

    @Given("I click on Admin Tab")
    public void i_click_on_admin_tab() {
        WebElement AdminTab = driver.findElement(By.linkText("Admin"));
        throw new io.cucumber.java.PendingException();
    }

    @Given("I get number of records")
    public void i_get_number_of_records() {
        List<WebElement> Records = driver.findElements(By.id("Record"));
        System.out.println(Records.size());
        throw new io.cucumber.java.PendingException();
    }

    @Given("I press on add button")
    public void i_press_on_add_button() {
        addButton.click();
        throw new io.cucumber.java.PendingException();
    }

    @Given("I fill the required data")
    public void i_fill_the_required_data(String employeeName , String userName , String Password, String confirmPassword){
          WebElement userRole = driver.findElement(By.id("userRole"));
          Select userRoleSelect = new Select(userRole);
          userRoleSelect.selectByVisibleText("Admin");
          EmployeeNameTxt.sendKeys(employeeName);
          WebElement Status = driver.findElement(By.id("Status"));
          Select statusSelect = new Select(Status);
          statusSelect.selectByVisibleText("Enabled");
          userNameTxt.sendKeys(userName);
          passwordTxt.sendKeys(Password);
          confirmPasswordTxt.sendKeys(confirmPassword);
          throw new io.cucumber.java.PendingException();
    }

    @When("I press on save button")
    public void i_press_on_save_button() {
        saveButton.click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("the number of records increased by one")
    public void the_number_of_records_increased_by_one() {
        String initialCounter = driver.findElement(By.id("counter_id")).getAttribute("value");
        int counterValBefore = Integer.parseInt(initialCounter);
        String afterCounter = driver.findElement(By.id("counter_id")).getAttribute("value");
        int counterValAfter = Integer.parseInt(afterCounter);
        if(counterValAfter > counterValBefore){
            System.out.println("Counter incremented");
        }else{
            System.out.println("Counter not working");
        }
        throw new io.cucumber.java.PendingException();
    }
}