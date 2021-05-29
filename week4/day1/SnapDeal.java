package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		//to disable browser notification
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
				
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement mensFashion = driver.findElementByXPath("(//span[contains(text(),'Men')])[2]");
		
		Actions builder = new Actions(driver);
		builder
		.moveToElement(mensFashion)
		.pause(1000)
		.click(driver.findElementByXPath("(//span[text()='Shirts'])[2]"))
		.perform();
		
		WebElement firstItemPrice = driver.findElementByXPath("//span[contains(@id,'display-price')]");
		builder.moveToElement(firstItemPrice)
		.pause(500)
		.click(driver.findElementByXPath("//div[contains(text(),'Quick View')]"))
		.perform();

	}

}
