package lesson17HW.strategy;

public class Main {
    static void main() {
        PaymentContext context = new PaymentContext();
        context.setStrategy(new CardPayment());
        context.pay(100);
    }
}
