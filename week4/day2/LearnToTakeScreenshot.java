package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToTakeScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement eleHome = driver.findElementById("home");
		
		//Step1: to take the screenshot of window
		//File source = driver.getScreenshotAs(OutputType.FILE);
		
		//to get the screenshot of WebElement
		File source = eleHome.getScreenshotAs(OutputType.FILE);
		
		//Step2: create target file ; ./ represents root folder of my project (SeleniumLearning)
		File target = new File("./snaps/home.png");
		
		//Step3: copy the source file into target file
		FileUtils.copyFile(source, target);
		
		
		

	}

}
