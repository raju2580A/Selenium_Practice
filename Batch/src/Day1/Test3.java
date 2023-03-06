package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.msedge.driver", "R:\\WebDriver Selinum\\Drivers\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.google.com");

}
}