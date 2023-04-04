package ChainOfResponsibility.src.main.java.com.design.pattern.ChainOfResponsibility;

public class BankPaymentHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        if (amount <= 500) {
            System.out.println("Amound has been paid using bank in $ " + amount);
        } else {
            next.handlePayment(amount);
        }
    }
}
