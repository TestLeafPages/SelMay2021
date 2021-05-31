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

public class LearnWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// String title = driver.getTitle();
		// System.out.println(title);

		String firstWinHandle = driver.getWindowHandle();
		System.out.println(firstWinHandle);

		driver.findElementById("home").click();

		// String title2 = driver.getTitle();
		// System.out.println(title2);
		//System.out.println("*****************************");
		
		Set<String> windowHandles = driver.getWindowHandles();
		//String secondWindow=null;
		
		/*
		 * for (String eachRef : windowHandles) { if(!eachRef.equals(firstWinHandle)) {
		 * secondWindow = eachRef; } }
		 */
		
		//System.out.println("*****************************");
		
		//copy set into list
		List<String> listHandles =  new ArrayList<String>(windowHandles);
		
		String secondWin = listHandles.get(1);
		
		//to move control from 1 window to another window
		driver.switchTo().window(secondWin);
		
		//driver.findElementByXPath("//img[@alt='Buttons']").click();
		
		driver.close(); // will close current window
		
		//driver.quit(); // to close all the open windows
		
		//to  move the control to the first window
		driver.switchTo().window(listHandles.get(0));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
