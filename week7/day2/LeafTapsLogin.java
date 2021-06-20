package week7.day2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsLogin {

	@Test
	public void runLogin() throws IOException {
		// step1: set the path of the properties file
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");

		// Create object for Properties
		Properties prop = new Properties();

		// to load the properties file
		prop.load(fis);

		// to read a particular value from properties file
		// System.out.println(prop.getProperty("password"));

		  
		  WebDriverManager.chromedriver().setup(); 
		  ChromeDriver driver = new   ChromeDriver(); 
		  driver.manage().window().maximize(); driver.get(prop.getProperty("url"));
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		  driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		  driver.findElement(By.className("decorativeSubmit")).click();
		  
		 
	}

}
