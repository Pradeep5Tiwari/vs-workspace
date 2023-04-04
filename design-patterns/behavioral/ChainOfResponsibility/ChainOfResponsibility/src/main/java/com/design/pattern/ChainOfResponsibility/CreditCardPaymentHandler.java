package ChainOfResponsibility.src.main.java.com.design.pattern.ChainOfResponsibility;

public class CreditCardPaymentHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        if (amount <= 1000) {
            System.out.println("Amount has been paid using credit card in $ " + amount);
        } else {
            next.handlePayment(amount);
        }
    }
}
