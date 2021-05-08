package week1.day1;


public class Car {
	
	//dataType variableName = data;
	String bodyColor = "Red";
	byte numWheels = 4;
	int distanceTravelled = 45000;
	long ownerPhNo = 8884151543L;
	boolean isServiced = true;
	char fuelType = 'D';
	double carPrice = 800000.50455345356;
	float fuelCapacity = 30.5567F;
	String regNumber = "TN09AU2932";
	
	
	public void driveCar() {
		System.out.println("driving a car");
	
	}
	
	
	public String getCarColor() {
		String color = bodyColor;
				
		return color;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		//ClassName ObjectName = new ClassName();
		Car myCar = new Car();
		
		//objectName.methodName() -- to call the method
		myCar.driveCar();
		
		System.out.println(myCar.ownerPhNo);
		
		double price = myCar.carPrice;
		System.out.println(price);
		
		String carColor = myCar.getCarColor();
		//System.out.println(carColor);
		
		
		
		
		
		
		
	}

}
