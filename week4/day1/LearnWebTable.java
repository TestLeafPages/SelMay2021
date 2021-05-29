package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		List<WebElement> allRows = driver.findElementsByXPath("//table[@id='table_id']//tr");
		int rowCount = allRows.size();
						
		for (int i = 2; i <= rowCount; i++) { //rows
			
			List<WebElement> allData = driver.findElementsByXPath("//table[@id='table_id']//tr["+i+"]/td");
			int dataCount = allData.size();
			
			
			for (int j = 1; j <= dataCount; j++) { //columns
				
				//"+i+" ; "+j+"
				String text = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText();
				System.out.println(text);
				
				/*
				 * if (text.equals("Gopi")) { System.out.println("Row Number "+i);
				 * System.out.println("Column Number "+j); }
				 */
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
