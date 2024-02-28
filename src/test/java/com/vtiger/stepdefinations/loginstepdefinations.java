package com.vtiger.stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginstepdefinations {
	public WebDriver driver;
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
	    WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    driver.get("http://localhost:100");
	    
	}
	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
	   driver.findElement(By.name("user_password")).sendKeys("admin");
	}
	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.name("Login")).click();
	   
	}
	@Then("user should be on home page")
	public void user_should_be_on_home_page() {
		//driver.findElement(By.xpath("(//a[contains(text(),'Home')])[1]")).click();
		driver.findElement(By.linkText("Home")).click();
	    
	}
	@Then("user can see logout option")
	public void user_can_see_logout_option() {
	 driver.findElement(By.linkText("Logout")).click();   
	}



	}
