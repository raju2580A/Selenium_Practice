package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_PATH {

	public static void main(String args[]) {
		
	//relative path  tagname[@attributename='value']
		System.setProperty("webdriver.chrome.driver", "R:\\WebDriver Selinum\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
	}
}
