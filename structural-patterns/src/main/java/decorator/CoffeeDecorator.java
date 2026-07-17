package decorator;

public abstract class CoffeeDecorator implements Coffee {

    private final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public int getCost() {
        return decoratedCoffee.getCost();
    }

}
