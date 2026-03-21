package lesson17HW.strategy;

class CashPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid by cash: " + amount);
    }
}
