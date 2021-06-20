package week7.day2;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFluentWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		  ChromeDriver driver = new   ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("http://leafground.com/pages/disapper.html");
		  
		  WebElement eleDisappear = driver.findElementByXPath("//button[@id='btn']/b");
		  
		  Wait wait = new FluentWait(driver)
				  		  .withTimeout(Duration.ofSeconds(5))
				  		  .pollingEvery(Duration.ofMillis(50));
				  		 // .ignoring(Exception.class);
		  
		  //Create object for WebDriverWait
		 // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		  wait.until(ExpectedConditions.invisibilityOf(eleDisappear));
		  
		  
		 // wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//button[@id='btn']/b")));
		  	  
		 // Thread.sleep(5000);
		  String text = driver.findElementByTagName("strong").getText();
		  System.out.println(text);

	}

}
