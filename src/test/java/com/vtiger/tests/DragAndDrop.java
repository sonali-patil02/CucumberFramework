package com.vtiger.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Selenium/Softwares/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://localhost:100/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.name("Customise")).click();
		Actions act=new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("cl4")), driver.findElement(By.id("cl5"))).perform();
		System.out.println(driver.findElement(By.id("c15")).getText().equals("Leads"));
}
}