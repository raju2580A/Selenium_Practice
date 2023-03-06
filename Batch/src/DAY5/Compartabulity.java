package DAY5;

import org.openqa.selenium.WebDriver;

public class Compartabulity {

	public static void test(WebDriver driver) {
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
}
