package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String input = "PayPal India";
		//output PaylIndi
		
		//step1: convert the String into Character Array
		char[] charArray = input.toCharArray();
		
		//Step2: Create a set
		Set<Character> setChar = new LinkedHashSet<Character>();
		
		//Step3: add the array values into set
		for (Character value : charArray) {
			if(value!=' ') {
				setChar.add(value);
			}
				
		}
		
		System.out.println(setChar);
	}

}
