package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "R:\\WebDriver Selinum\\Drivers\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com");
	}

}
