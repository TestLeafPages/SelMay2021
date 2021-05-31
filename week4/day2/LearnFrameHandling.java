package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrameHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://dev111627.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//to get inside the frame using Id or Name
		//driver.switchTo().frame("gsft_main");
		
		//using index; index starts with 0
		//driver.switchTo().frame(0);
		
		WebElement eleMyFrame = driver.findElementByXPath("//iframe[@title='Main Content']");
		
		//using WebElement
		driver.switchTo().frame(eleMyFrame);
		
		//interact with the element inside the frame
		driver.findElementById("user_name").sendKeys("admin");
		
		

	}

}
