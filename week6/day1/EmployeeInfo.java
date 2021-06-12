package week6.day1;

public class EmployeeInfo {
	
	static {
		System.out.println("Static Block of code");
	}

	public static void main(String[] args) {
		
		Employees.companyAddress();
		System.out.println(Employees.companyName);

	}

}
