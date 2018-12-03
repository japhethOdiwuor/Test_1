package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Verify_7_View_Details_MOTO_G5_Plus extends Verify_5_Select_BRAND_MOTOROLA {

	String Search_Input = "Moto G5 Plus (Lunar Grey, 32 GB)";
	public static String Linkurl;

	@Test(priority = 16)
	public void search_MobilePhone() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Search_Input);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}

	@Test(priority = 17)
	public void GetURL_Phone() throws InterruptedException {
		System.out.println("-----------------------------");
		WebElement link = driver.findElement(
				By.xpath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div/a"));
		Linkurl = link.getAttribute("href");
		System.out.println("Link URL =>" + Linkurl);
		System.out.println("-----------------------------");
	}

	@Test(priority = 18)
	public void Navigate_To_Phone_LinkURL() throws InterruptedException {
		driver.get(Linkurl);
		Thread.sleep(2000);

	}

	@Test(priority = 19)
	public void Verify_Navigation_Successful() throws InterruptedException {
		WebElement Button = driver.findElement(By.xpath("//button[contains(.,' BUY NOW')]"));
		if (Button.isDisplayed()) {
			System.out.println("Successfully Verified Naviagation as Button *BUY NOW* is present on Page");
			System.out.println("-----------------------------");
		}

		else {
			System.out.println("Failed NAVIGATION as Button *BUY NOW* is NOT Present on Page");
			System.out.println("-----------------------------");
		}
		

	}
}
