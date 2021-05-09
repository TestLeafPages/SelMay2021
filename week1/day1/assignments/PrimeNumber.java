package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 5;
		
		int count = 0;
		
		for (int i = 1; i <= input; i++) {
			
			if(input % i == 0) {
				count = count+1; // increase the count when it is successfully divided
			}
			
		}
		
		if(count == 2) {
			System.out.println("given number is a prime number");
		}
		else {
			System.out.println("given number is not a prime number");
		}

	}

}
