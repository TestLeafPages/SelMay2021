package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*
		 * //click Alert Box
		 * driver.findElementByXPath("//button[text()='Alert Box']").click();
		 * 
		 * //to switch the control from main window to the alert Alert alert =
		 * driver.switchTo().alert();
		 * 
		 * //to read the alert message String text = alert.getText();
		 * System.out.println(text);
		 * 
		 * //to click on Ok button alert.accept();
		 * 
		 * 
		 * //Click Confirm Box
		 * driver.findElementByXPath("//button[text()='Confirm Box']").click();
		 * 
		 * //to cancel the alert driver.switchTo().alert().dismiss();
		 * 
		 * //Click Prompt Box
		 * driver.findElementByXPath("//button[text()='Prompt Box']").click();
		 * 
		 * Alert alert2 = driver.switchTo().alert();
		 * 
		 * //String text2 = alert2.getText(); //System.out.println(text2);
		 * 
		 * alert2.sendKeys("Hari"); Thread.sleep(3000);
		 * 
		 * alert2.accept();
		 */
		
		driver.findElementByXPath("//button[text()='Sweet Alert']").click();
		driver.findElementByXPath("//button[text()='OK']").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
