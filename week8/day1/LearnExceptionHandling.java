package week8.day1;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int z = 0;
		
		int[] num = {10,20,30};
		
		
		
		try {
			try {
				z = x / y;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			System.out.println(num[3]);
			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println(z);
		System.out.println("End of the program");

	}

}
