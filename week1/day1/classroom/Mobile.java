package week1.day1.classroom;

public class Mobile {
	
	
	String mobileModel = "Mi Note10";
	int mobileWeight = 200;
	boolean isFullCharge = false;
	double mobileCost = 10000.56;
	
	
	public void makeCall() {
		System.out.println("made call");

	}
	
	public void sendMsg() {
		System.out.println("sent msg");

	}

	public static void main(String[] args) {
		Mobile mob = new Mobile();
		
		mob.makeCall();
		mob.sendMsg();
		
		System.out.println(mob.mobileCost);
		System.out.println(mob.mobileModel);
		System.out.println(mob.mobileWeight);
	}

}
