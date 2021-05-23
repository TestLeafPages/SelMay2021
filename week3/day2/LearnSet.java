package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> values = new TreeSet<String>();
		
		//method to add values into set; 
		values.add("Naveen");
		values.add("Hari");
		values.add("Sam");
		values.add("Sheriba");
		values.add("Dhivya");
		
		//values.add("Hari");
		
		System.out.println(values);
		
		//copy data from one collection to another
		List<String> listValues  =  new ArrayList<String>(values);
		System.out.println(listValues.get(2));
		
		
		/*
		 * for (String eachValue : values) { System.out.println(eachValue); }
		 */
		
		
		
		

	}

}
