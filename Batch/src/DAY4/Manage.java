package DAY4;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {
	public static void main(String args[]) throws InterruptedException{
		
	

	System.setProperty("webdriver.chrome.driver","R:\\WebDriver Selinum\\Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	Window wind = driver.manage().window();
	Thread.sleep(5000);
			
	wind.maximize();
}
}