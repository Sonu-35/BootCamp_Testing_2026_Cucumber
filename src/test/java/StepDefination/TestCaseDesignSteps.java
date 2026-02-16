package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCaseDesignSteps {
	WebDriver driver;
	
	@Given("User should open Chrome browser")
	public void user_should_open_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	 
	@When("User should Enter the URL in Browser")
	public void user_should_enter_url_in_search_box(String string) {
		
		driver.navigate().to("https://www.saucedemo.com/");
		
	}
	 
	@When("User should Navigate Home pages")
	public void user_should_navigate_home_page() {
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched!");
			
		} else {
			System.out.println("wrong URL");
		}
	}
	 
	@When("User should Enter the username and password in edit box.")
	public void user_should_enter_the_username_and_password_in_edit_box() {
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
 
	}
	 
	@When("Click on Login PushButton")
	public void user_should_click_on_login_push_button() {
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
	}
	 
	@Then("Message displayed Swag Labs successfully")
	public void message_displayed_swag_labs_successfully() {
	   
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			
			System.out.println("Title matched!");
			
		} else {
			
			System.out.println("wrong URL");
		}
		
	}
	 
	@Then("Place handover on Sauce Labs backpack item and click")
	public void place_handover_on_sauce_labs_backpack_item_and_click() {
		
		driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).click();
	   
	}
	 
	@Then("Click on add to cart PushButton")
	public void click_on_add_to_cart_push_button() {
	   
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		
	}
	 
	@Then("Click on continue Shopping PushButton")
	public void click_on_continue_shopping_push_button() {
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		driver.findElement(By.xpath("//button[@id='continue-shopping']")).click();
	   
	}
	 
	@Then("User should Place handover on Sauce Labs bike Light item")
	public void user_should_place_handover_on_sauce_labs_bike_light_item() {
		
		driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Bike Light']")).click();
	    
	}
	 
	@Then("Click on Add To Cart PushButton")
	public void click_on_add_to_cart_push_button1() {
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
	}
	 
	@Then("Click on Checkout")
	public void user_should_click_on_checkout() {
		
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
	    
	}
	 
	@Then("User should Quit Swag Labs Application")
	public void user_should_quit_swag_labs_application() {
		
		driver.quit();
	    
	}
	 
}
