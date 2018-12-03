package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Verify_6_Clear_Brand_Filter_Only extends Verify_5_Select_BRAND_MOTOROLA {

	String unEXPECTED_Result = "Moto";

	@Test(priority = 14)
	public void UN_click_MOTOROLA_brand() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/section[5]//label[contains(.,'Motorola')]")).click();
		Thread.sleep(5000);

	}

	@Test(priority = 15)
	public void verify_Returned_Results() throws InterruptedException {
		for (int resultNo = 1; resultNo <= 3; resultNo++) {
			System.out.println("----------------------");
			System.out.println("Executing for Returned Result = |-> " + resultNo);
			String resultData = driver
					.findElement(
							By.xpath("//div[@class='bhgxx2 col-12-12'][" + resultNo + "]//div[@class='_3O0U0u']//a"))
					.getText();

			if (resultData.contains(unEXPECTED_Result)) {
				System.out.println("----------------------");
				System.out.println("Text on Section => " + resultData);

				System.out.println("----------------------");
				System.out.println("FAILED Returned Results contains **" + unEXPECTED_Result + "** in Description");
				System.out.println("Other BRANDS NOT present");
				System.out.println("----------------------");
			}

			else {
				System.out.println("----------------------");
				System.out.println("Text on Section => " + resultData);

				System.out.println("----------------------");
				System.out.println("Successfully Verified Returned Results DOES NOT contain **" + unEXPECTED_Result
						+ "** in Description");
				System.out.println("Other BRANDS Present");
				System.out.println("----------------------");

			}
		}

	}

}
