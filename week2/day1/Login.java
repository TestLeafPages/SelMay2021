package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;





public class Login {

	
	public static void main(String[] args) throws InterruptedException  {
		//steps to launch application
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//to locate the element
		//WebElement userName = driver.findElementById("username");  //shortcut to save in a variable ctrl+2, then press L
		//to type a value in a text field
		//userName.sendKeys("DemoSalesManager");
		
		//to locate and interact with WebElement
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		WebElement password = driver.findElementByName("PASSWORD");
		password.sendKeys("crmsfa");
		
		/*
		 * Thread.sleep(3000); password.clear();
		 */
		//locate and click the button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//linkText to locate link
		driver.findElementByLinkText("CRM/SFA").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
