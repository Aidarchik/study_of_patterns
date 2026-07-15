package abstract_factory;

public class DarkButtonAF implements ButtonAF {
    @Override
    public void paint() {
        System.out.println("Отрисовка темной кнопки");
    }
}
