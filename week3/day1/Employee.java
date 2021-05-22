package week3.day1;

public class Employee {

	int empId;
	String empName;
	boolean empStatus;

	//default constructor
	public Employee() {
		this(200,"Prasad",true);
		System.out.println("Default Constructor");
		
	}
	
	//parameterized Constructor
	Employee(int id, String name, boolean status){
		this(100,"Hari"); // will call the default constructor
		System.out.println("Parameterized Constructor");
		this.empId = id;
		this.empName = name;
		this.empStatus = status;
		
	}
	
	//parameterized Constructor
		Employee(int empId, String empName){
			//this(); // will call the default constructor
			System.out.println("Parameterized Constructor");
			this.empId = empId;
			this.empName = empName;
						
		}

	public static void main(String[] args) {
		// ClassName objectName = new Constructor(); //constructor name should be same
		// as class name
		Employee emp = new Employee();

		System.out.println(emp.empId);
		System.out.println(emp.empName);
		System.out.println(emp.empStatus);
	}

}
