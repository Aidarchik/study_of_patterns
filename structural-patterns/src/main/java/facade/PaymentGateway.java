package facade;

public class PaymentGateway {
    public boolean charge(int userId, int cost) {
        System.out.println("Деньги списаны");
        return true;
    }
}
