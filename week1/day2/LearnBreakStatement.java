package week1.day2;

public class LearnBreakStatement {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			
			if(i == 3) {
				System.out.println("three");
				break; //exit from the loop
			}
			
			System.out.println(i);
			
		}
		
		System.out.println("out of for loop");
		
	}

}
