package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;





public class CreateLead {

	
	public static void main(String[] args) throws InterruptedException  {
		//steps to launch application
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		
		//to locate and interact with WebElement
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		WebElement password = driver.findElementByName("PASSWORD");
		password.sendKeys("crmsfa");
		
		//locate and click the button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//linkText to locate link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Step7: Click Leads link
		driver.findElementByLinkText("Leads").click();
		
		//Step8: Click Create Lead link
		driver.findElementByLinkText("Create Lead").click();
		
		//Step9: Enter Company Name, First Name and Last Name
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Hari");
		driver.findElementById("createLeadForm_lastName").sendKeys("R");
		
		//Step10: Click on Create Lead button
		driver.findElementByName("submitButton").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
