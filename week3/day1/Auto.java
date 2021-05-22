package week3.day1;

public class Auto extends Vehicle{
	
	public void handStart() {
		System.out.println("Hand Start");

	}
	
	public static void main(String[] args) {
		Auto myAuto = new Auto();
		
		myAuto.handStart();
		myAuto.soundHorn();
		myAuto.applyBrake();
	}

}
