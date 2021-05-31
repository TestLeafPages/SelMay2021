package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnNestedFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//to get inside the frame using Id or Name
		//driver.switchTo().frame("gsft_main");
		
		//using index; index starts with 0
		driver.switchTo().frame(0);
		driver.findElementById("Click").click();
		
		//to get into main window
		driver.switchTo().defaultContent();
		
		//to get into the second frame
		driver.switchTo().frame(1); //outer frame
		
		driver.switchTo().frame("frame2"); //inner frame
		
		driver.findElementById("Click1").click();
		
		//it will take you out of all frames
		driver.switchTo().defaultContent();
		
		String text = driver.findElementByTagName("h1").getText();
		System.out.println(text);
		
		//it will take to the immediate parent frame
		driver.switchTo().parentFrame();
		
		
		
		
		

	}

}
