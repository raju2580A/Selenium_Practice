package DAY2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "R:\\WebDriver Selinum\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String A=driver.getTitle();
		String ExceptedTitle="Facebook – log in or sign up";
		
		if(A.equals(ExceptedTitle)) {
			System.out.println("Title is Correct");
			
		}
		else {
			System.out.println("Title is Not Correct");
		}
		System.out.println("Actual title :"+ A);
		driver.close();
	}

}
