package DAY4;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage6 {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","R:\\WebDriver Selinum\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https:www.facebook.com");
		Thread.sleep(5000);
		
	Point	targetposition = new  Point(100,200);
	
	driver.manage().window().setPosition(targetposition);
	driver.quit();
	}
}
