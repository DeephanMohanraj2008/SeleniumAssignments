package week4.day1;

//Class Amazon extending CanaraBank
public class Amazon extends CanaraBank {
	
	//All the unimplemented methods from Payments interface are implemented here

	public void cashOnDelivery() {
		System.out.println("COD");
	}

	public void upiPayments() {
		System.out.println("UPI");
	}

	public void cardPayments() {

		System.out.println("Card Payments");
	}

	public void internetBanking() {
		System.out.println("Internet Banking");
		
	}
	public static void main(String[] args) {
		//Creating Object for Amazon class
		Amazon amazon=new Amazon();
		
		//Calling interface methods
		amazon.cashOnDelivery();
		amazon.cardPayments();
		amazon.upiPayments();
		amazon.internetBanking();
		
		//Calling methods from Super class.
		amazon.recordPaymentDetails();	
		
	}
	
	}


