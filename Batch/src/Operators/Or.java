package Operators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Or {
	//tagname[@attribute='  ' or @attributename='  ']

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "R:\\WebDriver Selinum\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://integrator.actitime.com/auth/at");
		driver.findElement(By.xpath("//input[@class='ZmCOM' or @name='actiTimeUrl']")).sendKeys("Rajendra");
		
		driver.get("http://127.0.0.1:5500/Index1.html");
		driver.findElement(By.xpath("//input[@type='text' and @value='A']")).clear();
		Thread.sleep(5000);



	}

}
