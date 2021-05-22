package week3.day1;

public class EmployeeInfo {
	
	
	public void printEmployeeDetails(String empName) {
		System.out.println("Details of "+empName);

	}
	
		
	public void printEmployeeDetails(int empId) {
		System.out.println("Details of "+empId);

	}
	
	
	public void printEmployeeDetails(String empName, int empId) {
		System.out.println(empName+" "+empId);

	}
	
	public void printEmployeeDetails(int phNo, String empEmail) {
		System.out.println(phNo+" "+empEmail);

	}
	
	
	public void printEmployeeDetails(int phNo, int empId) {
		System.out.println(phNo+" "+empId);

	}
	
	public static void main(String[] args) {
		
		  EmployeeInfo emp = new EmployeeInfo(); 
		  emp.printEmployeeDetails("Hari");
		  emp.printEmployeeDetails(100); 
		  emp.printEmployeeDetails("Hari", 100);
		  emp.printEmployeeDetails(121234, "hari@testleaf");
		 
		
		/*
		 * System.out.println(100); System.out.println(true);
		 * System.out.println(255.25); System.out.println('%');
		 * System.out.println("Method overloading");
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
