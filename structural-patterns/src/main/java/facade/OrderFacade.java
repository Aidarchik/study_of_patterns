package facade;

public class OrderFacade {
    public boolean placeOrder(int productId, int userId) {
        Warehouse warehouse = new Warehouse();
        if (!warehouse.isAvailable(productId)) {
            return false;
        }

        PaymentGateway payment = new PaymentGateway();
        if (!payment.charge(userId, 500)) {
            return false;
        }

        ShippingService shipping = new ShippingService();
        shipping.shipProduct(productId);

        return true;
    }
}
