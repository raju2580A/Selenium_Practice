package DAY2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {
	public static void main(String args[]) {
		
	
	System.setProperty("webdriver.chrome.driver", "R:\\WebDriver Selinum\\Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https:www.google.com");
	driver.quit();
}
}