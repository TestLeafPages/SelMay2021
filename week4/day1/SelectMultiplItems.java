package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMultiplItems {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement selenium = driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[text()='Selenium']");
		WebElement loadrunner = driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[text()='Loadrunner']");
	
		Actions builder = new Actions(driver);
		builder.click(selenium).click(loadrunner).perform();
	}

}
