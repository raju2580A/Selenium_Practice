package DAY4;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","R:\\WebDriver Selinum\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https:www.facebook.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Dimension targetsize =new Dimension(100,100);
driver.manage().window().setSize(targetsize);
System.out.println("targetsize :"+ targetsize);
driver.quit();
}
}
