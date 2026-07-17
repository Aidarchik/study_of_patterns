package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderFacadeTest {
    @Test
    void shouldPlaceOrderSuccessfully() {

        OrderFacade orderFacade = new OrderFacade();

        boolean isSuccess = orderFacade.placeOrder(123, 45);

        assertTrue(isSuccess);
    }
}
