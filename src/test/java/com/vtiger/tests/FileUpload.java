package com.vtiger.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class FileUpload {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:/Selenium/Softwares/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:100/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.linkText("New Product")).click();
		//driver.findElement(By.name("imagename")).sendKeys("C:\\Users\\patil\\OneDrive\\Desktop\\NewFileUpload.xlsx");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.click(driver.findElement(By.xpath("//input[@type='file']"))).build().perform();
		String file="C:\\Users\\patil\\OneDrive\\Desktop\\New Text Document.txt";
		StringSelection stringselect=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect,null);
		
		Robot r=new Robot();  
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
}