package Day3;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
			public static void main(String args[]) throws InterruptedException{
				System.setProperty("webdriver.chrome.driver","R:\\WebDriver Selinum\\Drivers\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				
				driver.get("https://en.wikipedia.org/wiki/Instagram");
				Navigation nav = driver.navigate();
				Thread.sleep(5000);
				nav.back();
				Thread.sleep(3000);
				nav.forward();
				Thread.sleep(5000);
				nav.refresh();
				driver.close();
				
				nav.to("https://en.wikipedia.org/wiki/Instagram#History");
			}

			
			}

