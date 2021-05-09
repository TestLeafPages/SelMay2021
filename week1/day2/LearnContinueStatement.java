package week1.day2;

public class LearnContinueStatement {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			
			if(i == 3) {
				System.out.println("three");
				continue; //terminate the current iteration and continue the next iteration
			}
			
			System.out.println(i);
			
		}
		
	}

}
