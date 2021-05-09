package week1.day2;

public class Employees {
	
	public String getEmployeeDetails(int empId, String empName) {
	
		System.out.println(empId);
		System.out.println(empName);
		
		return "emp details";
	}

	public static void main(String[] args) {
		Employees emp = new Employees();
		
		emp.getEmployeeDetails(100,"Hari");

	}

}
