package strategy;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(1000);

        order.processPayment(new CreditCardStrategy());
        order.processPayment(new CryptoStrategy());
    }
}
