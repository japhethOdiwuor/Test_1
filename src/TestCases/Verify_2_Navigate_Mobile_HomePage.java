package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import LoginTest.Login;

public class Verify_2_Navigate_Mobile_HomePage extends Login {

	public static String homePAGEURL;
	public static String mobilePAGEURL;

	@Test(priority = 5)
	public void Navigate_Electonics_Mobile_Page() throws InterruptedException {

		homePAGEURL = driver.getCurrentUrl();

		driver.findElement(By.xpath("//span[contains(.,'Electronics')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Mobiles']")).click();
	}

	@Test(priority = 6)
	public void verify_NavigationTo_MobilePage() throws InterruptedException {
		Thread.sleep(2000);
		mobilePAGEURL = driver.getCurrentUrl();

		if (homePAGEURL != mobilePAGEURL) {
			System.out.println("HOME PAGE URL =|"+homePAGEURL);
			System.out.println("MOBILE PAGE URL =|"+mobilePAGEURL);
			System.out.println("----------------------");
			System.out.println("Successfully Verified Navigation to MOBILE Page");
			System.out.println("----------------------");
		}
		
		else {
			System.out.println("HOME PAGE URL =|"+homePAGEURL);
			System.out.println("MOBILE PAGE URL =|"+mobilePAGEURL);
			System.out.println("----------------------");
			System.out.println("FAILED to Navigation to MOBILE Page after click on MOBILE Link");
			System.out.println("----------------------");
		}
	}

}
