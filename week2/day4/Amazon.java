package week2.day4;

public class Amazon extends CanaraBank {

	public void cashOnDelivery() {
		System.out.println("It is Cash on Delivery method");
		
	}

	public void upiPayments() {
		System.out.println("It is UPI method");
		
	}

	public void cardPayments() {
		System.out.println("It is Card Payment method");
		
	}

	public void internetBanking() {
		System.out.println("It is internet Banking method");
		
	}

	public static void main(String[] args) {
		Amazon amazonData = new Amazon();
		amazonData.cardPayments();
		amazonData.cashOnDelivery();
		amazonData.internetBanking();
		amazonData.recordPaymentDetails();
		amazonData.upiPayments();
	}
}
