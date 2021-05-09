package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		//declare using string literal; It is case sensitive
		String str1 = "welcome1234"; // Sequence characters; all the characters in string has index
								 // Index starts with 0	
								 // last character index is length()-1
		
		
		
		//System.out.println(str1.replace('e', 'x'));
		
		//System.out.println(str1.replace("e", ""));
		
		System.out.println(str1.replaceAll("[0-9]", ""));
		
		
		//System.out.println(str1.substring(2));
		
		//System.out.println(str1.substring(0, 3));
		
		//String str2 = "WELCOME";
		
		//System.out.println(str1.length() == str2.length());
		
		//to compare values of 2 strings
		//System.out.println(str1.equals(str2));
		
		//to ignore the case sensitive and then compare
		//System.out.println(str1.equalsIgnoreCase(str2));
		
		//method to count the characters in String
		//System.out.println(str1.length());
		
		//method to get single character 
		//System.out.println(str1.charAt(str1.length()-1));
		
		/*
		 * for (int i = str1.length() - 1; i >= 0 ; i--) {
		 * System.out.print(str1.charAt(i)); }
		 */
		
		//char[] chars = str1.toCharArray(); // {'w','e','l','c','o','m','e'}
		
		/*
		 * for (int i = 0; i < chars.length; i++) { System.out.println(chars[i]); }
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * String str2 = "welcome";
		 * 
		 * //declare using new keyword String str3 = new String("welcome");
		 * 
		 * //to compare the memory address System.out.println(str1 == str2);
		 * System.out.println(str1 == str3);
		 */
	}

}
