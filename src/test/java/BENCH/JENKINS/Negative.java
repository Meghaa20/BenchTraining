package BENCH.JENKINS;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Negative extends HomePage {
	@Test
	public void negative() {
		
		driver.findElement(By.xpath("//a[contains(text(),'home')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("megha");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("megha@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		
	}

}
