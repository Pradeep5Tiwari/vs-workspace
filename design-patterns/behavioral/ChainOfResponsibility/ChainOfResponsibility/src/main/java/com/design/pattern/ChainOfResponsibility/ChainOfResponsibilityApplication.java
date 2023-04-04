package ChainOfResponsibility.src.main.java.com.design.pattern.ChainOfResponsibility;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class ChainOfResponsibilityApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ChainOfResponsibilityApplication.class, args);

		PaymentHandler bank = new BankPaymentHandler();
		PaymentHandler creditCard = new CreditCardPaymentHandler();
		PaymentHandler payPal = new PayPalPaymentHandler();

		bank.setNext(creditCard);
		creditCard.setNext(payPal);

		bank.handlePayment(500);
		bank.handlePayment(600);
		bank.handlePayment(700);
		bank.handlePayment(800);
	}

}
