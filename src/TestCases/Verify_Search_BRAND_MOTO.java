package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Verify_Search_BRAND_MOTO extends Verify_Filter_RAM_4GB {

	String Search_Input = "Moto";

	@Test(priority = 10)
	public void search_BRAND_Moto() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search Brand']")).sendKeys(Search_Input);
		Thread.sleep(1000);
		
	}

	@Test(priority = 11)
	public void verify_ReturnedResults() throws InterruptedException {
		Thread.sleep(2000);
		String Brand_Section = driver.findElement(By.xpath("//*[@id='container']//div/section[5]")).getText();
		if (Brand_Section.contains("Motorola")) {
			System.out.println("----------------------");
			System.out.println(Brand_Section);
			System.out.println("Successfully Verified Brand_Section contains **MOTOROLA**");
			System.out.println("----------------------");
		} else {
			System.out.println("----------------------");
			System.out.println(Brand_Section);
			System.out.println("FAILED Brand_Section DOES NOT contain **MOTOROLA**");
			System.out.println("----------------------");
		}
	}

}
