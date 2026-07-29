package testsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductSearchTest extends baseSetup {
	
	@Test(priority=2)
	
	public void searchProduct() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		
		WebElement search=driver.findElement(By.xpath("//input[@id='search_product']"));
		
		search.click();
		search.sendKeys("Winter Top");
					
		driver.findElement(By.id("submit_search")).click();
		
		 WebElement product = driver.findElement(By.xpath("//p[text()='Winter Top']"));

	     Assert.assertTrue(product.isDisplayed(), "Product is not displayed.");

	     System.out.println("Product Found");
	}

}
