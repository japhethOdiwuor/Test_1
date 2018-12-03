package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Verify_8_Add_To_CART extends Verify_7_View_Details_MOTO_G5_Plus {

	@Test(priority = 20)
	public void Add_To_Cart() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(.,'CART')]")).click();
		Thread.sleep(5000);
	}

	@Test(priority = 21)
	public void Verify_Item_Added_to_CART() throws InterruptedException {
		System.out.println("-----------------------------");
		WebElement button = driver.findElement(By.xpath("//span[contains(.,'Remove')]"));
		if (button.isDisplayed()) {
			System.out.println("Successfully Verified ITEM ADDED TO CART");
			System.out.println("-----------------------------");
		}

		else {
			System.out.println("Failed To ADD ITEM TO CART");
			System.out.println("-----------------------------");
		}
	}

}
