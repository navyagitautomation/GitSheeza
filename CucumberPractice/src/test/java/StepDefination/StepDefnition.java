package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefnition {

	WebDriver driver;
@Given("user lauch FB application")
public void user_lauch_fb_application() {
	
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
   
}

@And("enters username and password")
public void enters_username_and_password() {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ABCD");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
    
}

@Then("click on Login button")
public void click_on_login_button() {
	
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
    }


@And("enters {string} and {string}")
public void enters_and(String Un, String Pw) {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Un);
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(Pw);
}

}
