package DAY4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage2 {

	public static void main(String args[])throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","R:\\WebDriver Selinum\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Instagram");
		Thread.sleep(5000);
		driver.manage().window().fullscreen();
	}
}
