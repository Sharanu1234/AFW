package testfacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyValidLogin {

	
	@Test
	public void validLogin()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sharanu1234@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("cricket206"); 
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
