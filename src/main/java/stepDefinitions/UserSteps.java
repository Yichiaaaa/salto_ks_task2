package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserSteps {
	
	
	WebDriver driver;
			
	    

		@Given("login as {string} with {string} and {string}")
	    public void login_as_with_and(String userType, String email, String password) {
	        driver.findElement(By.id("email")).sendKeys(email);
	        driver.findElement(By.id("password")).sendKeys(password);
	        driver.findElement(By.id("continueBtn")).click();
	        driver.findElement(By.id("verifucation")).sendKeys("CODE");
	        driver.findElement(By.id("loginBtn")).click();
	        driver.findElement(By.id("setting")).click();
	        String usertTitle= driver.findElement(By.id("step")).getText();
	        Assert.assertEquals(usertTitle,userType);
	   
	        
	    }
	    @When("on {string} screen")
	    public void on_screen(String screen) {
	    	driver.findElement(By.id(""+screen+"")).click();
	    	
	    }
	    @Then("user click on create user enter {string}, {string} and click on next user land on {string}")
	    public void user_click_on_create_user_enter_and_click_on_next_user_land_on(String firstname, String lastname, String step) {
	    	driver.findElement(By.id("ADD&INVITE")).click();
	    	driver.findElement(By.id("firstname")).sendKeys(firstname);
	    	driver.findElement(By.id("lastname")).sendKeys(lastname);
	    	driver.findElement(By.id("next")).click();
	    	String s= driver.findElement(By.id("step")).getText();
	    	Assert.assertEquals(s,step);
	    }

	    @Then("user select {string}, enter {string}, and click on next user is on {string}")
	    public void user_select_enter_and_click_on_next_user_is_on(String siteuser, String email, String step) {
	    	driver.findElement(By.id(""+siteuser+"")).click();
	    	driver.findElement(By.id("email")).sendKeys(email);
	    	driver.findElement(By.id("next")).click();
	    	String s= driver.findElement(By.id("step")).getText();
	    	Assert.assertEquals(s,step);

	    }
	    
	    @Then("user can see {string} {string} {string} and {string}")
	    public void user_can_see_and(String firstname, String lastname, String email, String userType) {
	    	String first= driver.findElement(By.id("firstname")).getText();
	    	String last= driver.findElement(By.id("lastname")).getText();
	    	String mailaddress= driver.findElement(By.id("email")).getText();
	    	String usertype= driver.findElement(By.id("usertype")).getText();
	    	Assert.assertEquals(first,firstname);
	    	Assert.assertEquals(last,lastname);
	    	Assert.assertEquals(usertype,userType);
	    	
	    }
	    
	    @Then("user click on invite")
	    public void user_click_on_invite() {
	    	driver.findElement(By.id("invite")).click();

	    }
	    @Then("user can see available locks")
	    public void user_can_see_available_locks() {
	    	driver.findElement(By.id("Locks")).click();
	    	List <WebElement> locknames = driver.findElements(By.id("locknames"));
	    	int locks=locknames.size();
	    	Assert.assertEquals(4, locks);
	    }
	    @Then("user log out")
	    public void user_log_out() {
	    	driver.findElement(By.id("Settings")).click();
	    	driver.findElement(By.id("logoutBtn")).click();
	    }
	    




	
}
