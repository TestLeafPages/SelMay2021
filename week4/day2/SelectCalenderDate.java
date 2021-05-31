package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCalenderDate {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElementById("datepicker").click();
		
		driver.findElementByXPath("//table//a[text()='10']").click();
		
		String text = driver.findElementById("datepicker").getAttribute("value");
		System.out.println(text);
		
		
		
		
		

	}

}
