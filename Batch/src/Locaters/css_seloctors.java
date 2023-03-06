package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_seloctors {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "R:\\WebDriver Selinum\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
			driver.findElement(By.cssSelector("input[type='text']")).sendKeys("8309058978");
			driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Rajendra@123");
			driver.findElement(By.cssSelector("button[value='1']")).click();
			Thread.sleep(20000);
			driver.quit();
	}
}
