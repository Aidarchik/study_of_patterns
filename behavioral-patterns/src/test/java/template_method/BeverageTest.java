package template_method;

import org.junit.jupiter.api.Test;

public class BeverageTest {
    @Test
    void shouldMakeCoffeeWithCorrectSteps() {

        NetworkBeverageMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.makeBeverage();
    }
}
