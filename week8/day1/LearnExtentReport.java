package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		//step1: create physical html file
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result123.html");
		
		//to maintain the history of execution
		reporter.setAppendExisting(true);
		
		//step2: create extent report to capture the data
		ExtentReports extent = new ExtentReports();
		
		//step3: attach the actual data to the physical file
		extent.attachReporter(reporter);
		
		
		//steps to create test case and setup details
		ExtentTest test = extent.createTest("LoginAndLogout", "login test for leaftaps application");
		test.assignAuthor("Hari");
		test.assignCategory("Smoke");
		
		//update the status for test steps
		test.pass("Enter username as demosalesmanager", MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/LeafGround.png").build());
		test.pass("Enter password as crmsfa",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/home.png").build());
		test.pass("click login button",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/LeafGround.jpeg").build());
		
		//last mandatory step
		extent.flush();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
