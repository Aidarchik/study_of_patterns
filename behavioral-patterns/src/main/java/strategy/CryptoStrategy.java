package strategy;

public class CryptoStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Payment of Crypto");
    }
}
