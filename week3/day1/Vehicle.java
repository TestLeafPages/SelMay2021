package week3.day1;

public class Vehicle {
	
	public void applyBrake() {
		System.out.println("Apply brake");

	}
	
	public void soundHorn() {
		System.out.println("Sound Horn");

	}
	
	
	public static void main(String[] args) {
		Vehicle veh = new Vehicle();
		veh.applyBrake();
	}
	
}
