package Operators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		///find text using contains(text(),'text') and contains (@attribute,'text')]

		System.setProperty("webdriver.chrome.driver", "R:\\WebDriver Selinum\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("Rajendra");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("123456@");
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		
		Navigation nav = driver.navigate();
		nav.refresh();
		
		System.out.println("Url:"+driver.getCurrentUrl());
		System.out.println("Title"+driver.getTitle());
		System.out.println("Get Windowhandle id :"+driver.getWindowHandle());
		System.out.println("Page Source"+driver.getPageSource());
		Thread.sleep(5000);
		driver.quit();
	
	
	}
}
