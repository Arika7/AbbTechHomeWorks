package lesson17HW.strategy;

class CardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid by card: " + amount);
    }
}
