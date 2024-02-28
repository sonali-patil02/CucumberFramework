package com.vtiger.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Selenium/Softwares/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://localhost:100/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("showSubMenu"))).perform();
		Thread.sleep(2000);
		act.click(driver.findElement(By.linkText("New Vendor"))).perform();
		driver.findElement(By.xpath("//td[@class='moduleTitle']")).isDisplayed();
		act.moveToElement(driver.findElement(By.name("vendorname"))).perform();
		act.sendKeys("IDC").perform();
	    act.click(driver.findElement(By.xpath("(//input[@class='button'])[1]"))).perform();	
		driver.close();
		System.out.println("Closed Successfully.");
}
}