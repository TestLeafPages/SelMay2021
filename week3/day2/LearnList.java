package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		List<String> values = new LinkedList<String>();
		
		//method to add values into list; list data will be saved in index
		//index starts with 0
		values.add("Naveen");
		values.add("Hari");
		values.add("Sam");
		values.add("Sheriba");
		values.add("Dhivya");// last index size()-1
		
		//to find the number of items in list
		System.out.println(values.size());
		
		values.add("Hari");
		
		System.out.println(values.size());
		
		//values.remove("Hari");
		
		//to get data from list
		//System.out.println(values.get(0));
		
		//to get the last item
		//System.out.println(values.get(values.size()-1));
		
		System.out.println(values);
		//to sort the data in ascending order
		Collections.sort(values); //only for list
		
		System.out.println(values);
		
		/*
		 * for (int i = values.size()-1; i >= 0 ; i--) {
		 * System.out.println(values.get(i)); }
		 */
		
		//datatype tempVariavle : source
		/*
		 * for(String eachValue: values) { System.out.println(eachValue); }
		 */
		 
		
		/*
		 * for (int i = 0; i < values.size(); i++) { System.out.println(values.get(i));
		 * }
		 */
		
		
		
		
		
		
		
		
		
		
		

	}

}
