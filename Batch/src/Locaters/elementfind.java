package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementfind {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "R:\\WebDriver Selinum\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//	driver.findElement(By.id("email")).sendKeys("8309058978");
		
	//	driver.findElement(By.id("pass")).sendKeys("Rajendra@123");
		
		
		//driver.findElement(By.name("login")).click();
	   driver.findElement(By.linkText("Forgotten password?")).click();
	   
	   driver.findElement(By.id("identify_email")).sendKeys("8309058978");
	 driver.findElement(By.id("did_submit")).click();
	   
	   Thread.sleep(20000);
	   driver.quit();
		
		
}
}
