package abstract_factory;

public class DarkCheckboxAF implements CheckboxAF {
    @Override
    public void paint() {
        System.out.println("Отрисовка темного чекбокс");
    }
}
