package strategy;

public class Order {
    private int amount;

    public Order(int amount) {
        this.amount = amount;
    }

    public void processPayment(PaymentStrategy strategy) {
        strategy.pay(this.amount);
    }
}
