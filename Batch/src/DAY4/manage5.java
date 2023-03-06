package DAY4;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage5 {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","R:\\WebDriver Selinum\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https:www.facebook.com");
		Thread.sleep(3000);
		//driver.manage().window().maximize();
		
		Point pt =driver.manage().window().getPosition();
		
		pt.getX();
		pt.getY();
		
		System.out.println(pt.getX() + " : "+ pt.getY());
		
	}
}
