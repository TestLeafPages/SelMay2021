package week3.day2;

public class PNB implements RBI, CIBIL{

	public void creditScore() {
		System.out.println("90");
		
	}

	public void minimumBalance() {
		System.out.println("4000");
		
	}

	public void maximumLoanAmount() {
		System.out.println("400000");
		
	}
	
	public void covidLoan() {
		System.out.println("default method");
	}
	
	public static void main(String[] args) {
		PNB pnb = new PNB();
		pnb.creditScore();
		
		
		
	}

}
