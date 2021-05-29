package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement fromStation = driver.findElementById("txtStationFrom");

		fromStation.clear();
		fromStation.sendKeys("ms");
		fromStation.sendKeys(Keys.TAB);

		WebElement toStation = driver.findElementById("txtStationTo");

		toStation.clear();
		toStation.sendKeys("mdu");
		toStation.sendKeys(Keys.TAB);

		driver.findElementById("chkSelectDateOnly").click();

		Thread.sleep(10000);

		List<WebElement> allRows = driver
				.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");

		int rowCount = allRows.size();

		List<String> listTrainNames = new ArrayList<String>();

		for (int i = 1; i <= rowCount; i++) {

			String trainName = driver
					.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr[" + i + "]/td[2]")
					.getText();
			listTrainNames.add(trainName);
		}
		
		//copy the list into set to remove the duplicates
		Set<String> setTrainNames = new LinkedHashSet<String>();
		
		
		for (String eachName : listTrainNames) {
			
			if(!setTrainNames.add(eachName)) {
				System.out.println(eachName);
			}
			
		}
		
		
		/*
		 * if(listTrainNames.size() != setTrainNames.size()) {
		 * System.out.println("There are duplicate train names"); }else {
		 * System.out.println("No duplicate train names"); }
		 */
		
		
		
		
		
		
		

	}

}
