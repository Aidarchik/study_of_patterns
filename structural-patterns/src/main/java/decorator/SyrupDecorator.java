package decorator;

public class SyrupDecorator extends CoffeeDecorator {
    public SyrupDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Сироп";
    }

    @Override
    public int getCost() {
        return super.getCost() + 20;
    }
}
