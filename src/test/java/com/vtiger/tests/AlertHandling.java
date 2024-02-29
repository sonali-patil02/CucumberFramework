package com.vtiger.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Selenium/Softwares/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://localhost:100/index.php");
		System.out.println("Changes done by Prajkta branch");
		System.out.println("Changes done by");
		System.out.println("Changes done ");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.linkText("New Lead")).click();
		driver.findElement(By.name("lastname")).sendKeys("Patil");
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		driver.findElement(By.name("company")).sendKeys("XYZ");
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		Alert alt1=driver.switchTo().alert();
		System.out.println(alt1.getText());
        alt1.accept();
        
}
}