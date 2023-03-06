package DAY5;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Multibrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "R:\\WebDriver Selinum\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.msedge.driver", "R:\\WebDriver Selinum\\Drivers\\msedgedriver.exe");
		Compartabulity.test(new ChromeDriver());
		System.out.println("----------");
		Compartabulity.test(new EdgeDriver());
		System.out.println("----------");
	}

}
