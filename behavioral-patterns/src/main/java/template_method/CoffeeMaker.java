package template_method;

public class CoffeeMaker extends NetworkBeverageMaker {
    @Override
    protected void brew() {
        System.out.println("Фильтрация кофе через зерна...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Добавление молока и сахара.");
    }
}
