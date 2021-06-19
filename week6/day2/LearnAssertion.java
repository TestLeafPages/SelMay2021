package week6.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LearnAssertion {
	
	@Test
	public void runLogin() {
		
		String expTitle = "TestLeaf Automation Platform";
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		  driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		  boolean enabled = driver.findElement(By.className("decorativeSubmit")).isEnabled();
		 
		String actTitle = driver.getTitle();
		
		//Assert.assertEquals(actTitle, expTitle);
		//Assert.assertTrue(enabled);
		//Assert.assertFalse(enabled);
		
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actTitle, expTitle);
				
		
			
		System.out.println("Last line of code");
		
		//this a mandory; will consolidate the assertions
		softAssert.assertAll();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * if(expTitle.equals(actTitle)) { System.out.println("matching"); }else {
		 * System.out.println("not matching"); }
		 */
		
		
		
		
		
		
		
		
		
		
		

	}

}
