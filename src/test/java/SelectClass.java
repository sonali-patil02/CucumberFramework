import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Selenium/Softwares/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://localhost:100/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	     WebElement Theme=driver.findElement(By.name("login_theme"));
		Select sel=new Select(Theme);
		sel.selectByIndex(2);
		
		List<WebElement> lst=sel.getOptions();
		System.out.println("No of values resent in dropdown"+lst.size());
		Theme.click();
		WebElement Lang=driver.findElement(By.name("login_language"));
		Select sel2=new Select(Lang);
		Lang.click();
		
		driver.findElement(By.xpath("//input[@name='Login']")).click();


}
}