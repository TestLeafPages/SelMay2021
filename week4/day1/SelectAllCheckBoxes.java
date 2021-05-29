package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAllCheckBoxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		List<WebElement> allCheckBoxes = driver.findElementsByXPath("//label[text()='Select all below checkboxes ']/following::input");
		/*
		 * for (WebElement eachcheckBox : allCheckBoxes) { eachcheckBox.click(); }
		 */
		
		for (int i = 0; i < 3; i++) {
			allCheckBoxes.get(i).click();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
