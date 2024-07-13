package Annotation;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteNewUserSteps {
    ChromeDriver driver = new ChromeDriver();
    WebElement searchButton;
    WebElement deleteButton;

    @Given("I search with username for new user")
    public void i_search_with_username_for_new_user(String newUser) {
        driver.findElement(By.id("username")).sendKeys(newUser);
        throw new io.cucumber.java.PendingException();
    }

    @Given("I press on search button")
    public void i_press_on_search_button() {
        searchButton.click();
        throw new io.cucumber.java.PendingException();
    }

    @When("I press on delete button for the new user")
    public void i_press_on_delete_button_for_the_new_user() {
        deleteButton.click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("the number of records decreased by one")
    public void the_number_of_records_decreased_by_one() {
        String initialCounter = driver.findElement(By.id("counter_id")).getAttribute("value");
        int counterValBefore = Integer.parseInt(initialCounter);
        String afterCounter = driver.findElement(By.id("counter_id")).getAttribute("value");
        int counterValAfter = Integer.parseInt(afterCounter);
        if(counterValAfter < counterValBefore){
            System.out.println("Counter decremented");
        }else{
            System.out.println("Counter not working");
        }
        throw new io.cucumber.java.PendingException();
    }
    
    @After
    public void cleanUp(){
        driver.quit();
    }
}