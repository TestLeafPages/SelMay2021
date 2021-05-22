package week3.day1;

public class Audi extends Car{
	
	public void airBag() {
		System.out.println("air bag");
	}
	
	
	
	public static void main(String[] args) {
		Audi audiCar = new Audi();
		
		audiCar.airBag();
		
		audiCar.seatBelt();
		audiCar.handBreak();
		
	//	audiCar.applyBrake();
	//	audiCar.soundHorn();
		
		
	}

}
