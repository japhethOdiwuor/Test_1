package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import LoginTest.Login;

public class Verify_1_Navigate_HomePage extends Login {

	@Test(priority = 4)
	public void verify_Electronics_On_HomePage() {

		String elementText = driver.findElement(By.xpath("//*[@id='container']/div/header/div[3]/ul")).getText().trim();
		if (elementText.contains("Electronics")) {

			System.out.println(elementText);
			System.out.println("----------------------");
			System.out.println("Successfully Verified ELECTRONICS present on Home Page");
			System.out.println("----------------------");
		} else {

			System.out.println(elementText);
			System.out.println("----------------------");
			System.out.println("Failed to Verify ELECTRONICS present on Home Page");
			System.out.println("----------------------");
		}
	}

}
