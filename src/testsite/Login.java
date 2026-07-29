package testsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(MyListner.class)
public class Login extends baseSetup {

	@Test(priority=1)
	public void Login_With_Valid_Data() throws InterruptedException {
				
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		
		Thread.sleep(2000);
		WebElement uname=driver.findElement(By.xpath("//input[@data-qa='login-email']"));
		uname.click();
		uname.clear();
		uname.sendKeys("prajushinde105@gmail.com");
		
		Thread.sleep(2000);		
		WebElement pwd=driver.findElement(By.xpath("//input[@data-qa='login-password']"));
		pwd.click();
		pwd.clear();
		pwd.sendKeys("Prajakta@123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	}
}
