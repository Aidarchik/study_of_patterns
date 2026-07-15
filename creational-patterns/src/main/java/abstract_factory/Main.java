package abstract_factory;

public class Main {

    public static void main(String[] args) {

        GuiFactory factory = new DarkGuiFactory();

        ButtonAF button = factory.createButton();
        CheckboxAF checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();

    }
}
