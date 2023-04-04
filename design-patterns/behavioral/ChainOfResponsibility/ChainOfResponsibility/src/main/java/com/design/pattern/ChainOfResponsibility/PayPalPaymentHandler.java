package ChainOfResponsibility.src.main.java.com.design.pattern.ChainOfResponsibility;

public class PayPalPaymentHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        if (amount <= 1500) {
            System.out.println("Amount has been paid using paypal wallet in $ " + amount);
        } else {
            next.handlePayment(amount);
        }
    }
}
