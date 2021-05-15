package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;





public class LearnToInteractWithDropDown {

	
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
		
		//Locate the parent element which is having select tag
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		//create object for Selec class and pass the parent webelement
		Select dropDown = new Select(source);
		
		//select using visible text
		//dropDown.selectByVisibleText("Direct Mail");
		
		//select using value
		//dropDown.selectByValue("LEAD_CONFERENCE");
		
		//select using index
		dropDown.selectByIndex(1);
		
		//locate marketing campaign element
		driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("Automobile");
		
		//Select dropDown1 = new Select(mc);
		
		//dropDown1.selectByVisibleText("Automobile");
			
		
		//Step10: Click on Create Lead button
		//driver.findElementByName("submitButton").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
