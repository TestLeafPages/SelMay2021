package week1.day1;

public class OwnCar {
	
	public void soundHorn() {
		System.out.println("sound Horn");

	}
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.driveCar();
		myCar.getCarColor();
		
		OwnCar oc = new OwnCar();
		oc.soundHorn();
				
		
	}

}
