package testsite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddToCart extends ProductSearchTest {
	
	@Test(priority=3)
	public void addtocart() throws InterruptedException
	{
		
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//a[normalize-space()='View Product']")).click();
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[@type='button']")).click();
	 
	 
	}

}
