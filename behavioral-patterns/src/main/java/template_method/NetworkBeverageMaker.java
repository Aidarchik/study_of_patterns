package template_method;

public abstract class NetworkBeverageMaker {

    // Это и есть НАШ ШАБЛОННЫЙ МЕТОД. Он final, чтобы подклассы не могли нарушить порядок шагов!
    public final void makeBeverage() {
        boilWater();
        brew();          // шаг отличается (красный)
        pourInCup();
        addCondiments(); // шаг отличается (красный)
    }

    private void boilWater() {
        System.out.println("Кипячение воды... (Общий шаг)");
    }

    private void pourInCup() {
        System.out.println("Наливание в чашку... (Общий шаг)");
    }


    // Эти шаги абстрактные. Подклассы обязаны написать свою логику!
    protected abstract void brew();
    protected abstract void addCondiments();

}
