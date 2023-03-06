package DAY4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage3 {

	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","R:\\WebDriver Selinum\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Instagram");
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
	
		
		String A=driver.getCurrentUrl();
		String B="https://en.wikipedia.org/wiki/Instagram";
		if(A.equals(B)) {
			System.out.println("Corrent Url");
		}
		else {
			System.out.println("Incorrect Url");
	driver.manage().window().maximize();
	
	
		
	}
	}

}
