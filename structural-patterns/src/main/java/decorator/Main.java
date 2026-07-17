package decorator;

public class Main {

    public static void main(String[] args) {

        Coffee myCoffee = new SimpleCoffee();

        myCoffee = new MilkDecorator(myCoffee);

        myCoffee = new SyrupDecorator(myCoffee);

        System.out.println("Ваш заказ: " + myCoffee.getDescription());
        System.out.println("Итоговая цена: " + myCoffee.getCost() + " руб.");
    }
}
