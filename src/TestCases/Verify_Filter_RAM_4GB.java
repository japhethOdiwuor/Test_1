package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import LoginTest.Login;

public class Verify_Filter_RAM_4GB extends Login {

	String Search_Input = "Mobile Phones";

	@Test(priority = 7)
	public void search_MOBILE() throws InterruptedException {

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Search_Input);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Test(priority = 8)
	public void selecth_RAM_Size() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/section[4]//label[contains(.,'4 GB')]")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 9)
	public void verify_ReturnedResults() throws InterruptedException {
		Thread.sleep(2000);
		for (int resultNo = 1; resultNo <= 2; resultNo++) {
			System.out.println("----------------------");
			System.out.println("Executing for Returned Result = |-> " + resultNo);
			String resultData = driver
					.findElement(
							By.xpath("//div[@class='bhgxx2 col-12-12'][" + resultNo + "]//div[@class='_3O0U0u']//a"))
					.getText();

			if (resultData.contains(Search_Input)) {
				System.out.println("----------------------");
				System.out.println("Text on Section => " + resultData);

				System.out.println("----------------------");
				System.out.println(
						"Successfully Verified Returned Results contain **" + Search_Input + "** in Description");
				System.out.println("----------------------");
			}

			else {
				System.out.println("----------------------");
				System.out.println("Text on Section => " + resultData);

				System.out.println("----------------------");
				System.out.println("FAILED Returned Results DOES NOT contain **" + Search_Input + "** in Description");
				System.out.println("----------------------");
			}
		}
	}

}
