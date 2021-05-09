package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		int[] values = new int[3];
		
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
	//	values[3] = 40;
		
		//int[] values = {10,50,20,40,30}; // stored with index; index starts with 0
		
		//to get single value from array
		//System.out.println(values[3]);
		
		//to find the number of items in an array
		//System.out.println(values.length);
		
		//to get the last item index
		//int lastItemIndex = values.length-1;
		
		//System.out.println(values[values.length-2]);
		
		//to sort the data in ascending order
		Arrays.sort(values);
		
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		
		
		
		
		
		
		

	}

}
