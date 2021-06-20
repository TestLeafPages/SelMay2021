package week7.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		  ChromeDriver driver = new   ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("http://leafground.com/pages/appear.html");
		  
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  
		  //Create object for WebDriverWait
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@id='btn']/b"))));
		  	  
		 // Thread.sleep(5000);
		  String text = driver.findElement(By.xpath("//button[@id='btn']/b")).getText();
		  System.out.println(text);

	}

}
