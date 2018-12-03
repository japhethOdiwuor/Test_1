package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Verify_Select_BRAND_MOTOROLA extends Verify_Search_BRAND_MOTO {

	
	String Search_Result = "Moto";

	@Test(priority = 11)
	public void click_MOTOROLA_brand() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/section[5]//label[contains(.,'Motorola')]")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 13)
	public void verify_Returned_Results() throws InterruptedException {
		for (int resultNo = 1; resultNo <= 2; resultNo++) {
			System.out.println("----------------------");
			System.out.println("Executing for Returned Result = |-> " + resultNo);
			String resultData = driver
					.findElement(
							By.xpath("//div[@class='bhgxx2 col-12-12'][" + resultNo + "]//div[@class='_3O0U0u']//a"))
					.getText();

			if (resultData.contains(Search_Result)) {
				System.out.println("----------------------");
				System.out.println("Text on Section => " + resultData);

				System.out.println("----------------------");
				System.out.println(
						"Successfully Verified Returned Results contain **" + Search_Result + "** in Description");
				System.out.println("----------------------");
			}

			else {
				System.out.println("----------------------");
				System.out.println("Text on Section => " + resultData);

				System.out.println("----------------------");
				System.out.println("FAILED Returned Results DOES NOT contain **" + Search_Result + "** in Description");
				System.out.println("----------------------");
			}
		}

	}

}
