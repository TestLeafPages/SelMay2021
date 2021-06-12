package week6.day1;

public class Employees {
	String empName;
	int empId;
	static String companyName;
	
	Employees(String name, int id, String company){
		empName = name;
		empId = id;
		companyName = company;
	}
	
	
	public void printDetails() {
		System.out.println(empName+" "+empId+" "+companyName);

	}
	
	public static void companyAddress() {
		System.out.println("Nanganallur, Chennai");
		
	}
	
	
	public static void main(String[] args) {
		
		Employees emp1 = new Employees("Hari",100,"TestLeaf");
		Employees emp2 = new Employees("Prasad",200,"TestLeaf Software Solutions");
		
		emp1.printDetails();
		emp2.printDetails();
		
		companyAddress();
	}

}
