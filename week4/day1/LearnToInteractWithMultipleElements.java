package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToInteractWithMultipleElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		List<WebElement> elements = driver.findElementsByXPath("//input[@class='inputLogin']");

		//WebElement firstElement = elements.get(0);
		//firstElement.sendKeys("demosalesmanager");
		
		for (WebElement eachElement : elements) {
			System.out.println(eachElement.getAttribute("name"));
		}
		
		/*
		 * for (int i = 0; i < elements.size(); i++) { String name =
		 * elements.get(i).getAttribute("name"); System.out.println(name); }
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
