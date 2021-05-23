package week3.day2;

public class IOB implements RBI{
	
	public void ITLoan() {
		System.out.println("100000");
	}

	public void minimumBalance() {
		System.out.println("2000");
		
	}

	public void maximumLoanAmount() {
		System.out.println("2000000");		
	}
	
	public static void main(String[] args) {
		IOB iob = new IOB();
		iob.minimumBalance();
		iob.maximumLoanAmount();
		iob.ITLoan();
	}

	

}
