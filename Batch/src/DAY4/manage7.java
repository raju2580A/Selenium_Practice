package DAY4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage7 {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","R:\\WebDriver Selinum\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Life_Insurance_Corporation");
		Thread.sleep(5000);
		String Currentwindowid =driver.getWindowHandle();
		
		System.out.println("Currentwindowid :"+ Currentwindowid);
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
	
}
