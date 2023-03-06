package DAY2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking_webpage {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "R:\\WebDriver Selinum\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
			driver.get("https://facebook.com/");
			
			String source= driver.getPageSource();
			
			String pagesource="Forgotten password?";
			
			System.out.println("source :"+ source);
			
			if(source.contains(pagesource)) {
				System.out.println("Information is Contain");
				
			}
			else {
				System.out.println("Infromation is Not Contains");
			}
			driver.close();
			
			
			
}
}