package week8.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnThrow {
	
	
	public static int divide(int x, int y) {
		
		int z = 0;
		
		if( x < y) {
			throw new ArithmeticException("invalid input: Because of first number is smaller");
		}
		else {
			z = x / y;
		}
			
		return z;
	}

	public static void main(String[] args) {
		
			
		int result;
		try {
			result = LearnThrow.divide(5, 10);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//System.out.println(result);
		System.out.println("End of the program");

	}

}
