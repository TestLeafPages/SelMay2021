package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlePromptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//to get inside the frame using Id or Name
		driver.switchTo().frame("iframeResult123");
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		//switch alert
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hari");
		alert.accept();
		
		String text = driver.findElementById("demo").getText();
		
		if (text.contains("Hari")) {
			System.out.println("text contains my name");
		}
		else {
			System.out.println("text does not conatain my name");
		}
		
		
		

	}

}
