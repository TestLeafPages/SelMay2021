package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LauchApplication {

	public static void main(String[] args) throws InterruptedException  {
		
		//precondition: set up the driver path
		WebDriverManager.chromedriver().setup();
						
		//Step1: Open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Step2: Load the application URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(5000);
		
		//to close the browser
		driver.close();

	}

}
