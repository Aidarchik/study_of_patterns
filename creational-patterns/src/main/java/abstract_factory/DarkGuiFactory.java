package abstract_factory;

public class DarkGuiFactory implements GuiFactory {
    @Override
    public CheckboxAF createCheckbox() {
        return new DarkCheckboxAF();
    }

    @Override
    public ButtonAF createButton() {
        return new DarkButtonAF();
    }
}
