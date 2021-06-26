package week8.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFinallyBlock {

	public static void main(String[] args) {
		
			
		int x = 10;
		int y = 5;
		int z = 0;

		
		try {
			z = x / y;
		} 
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block");
		}
	

		System.out.println(z);
		System.out.println("End of the program");

	}

}
