package abstract_factory;

public interface GuiFactory {
    CheckboxAF createCheckbox();

    ButtonAF createButton();
}
