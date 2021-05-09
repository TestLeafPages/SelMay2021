package week1.day1.assignments;

public class FibinacciSeries {

	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13...
		
		int first = 0;
		int second = 1;
		System.out.println(first);
		System.out.println(second);
		
		int third = 0;
		
		for (int i = 1; i <= 6; i++) {
			
			third = first + second;
			System.out.println(third);
			
			first = second;
			second = third;
			
		}

	}

}
