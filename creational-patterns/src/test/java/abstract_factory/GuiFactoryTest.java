package abstract_factory;

import org.junit.jupiter.api.Test;

import java.awt.Button;
import java.awt.Checkbox;

import static org.junit.jupiter.api.Assertions.*;

class GuiFactoryTest {

    @Test
    void shouldCreateDarkThemeComponents() {
        // 1. Создаем фабрику для Темной темы (класса еще нет)
        GuiFactory factory = new DarkGuiFactory();

        // 2. Фабрика должна уметь создавать абстрактные кнопку и чекбокс
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        // 3. Проверяем, что создались именно ТЁМНЫЕ элементы
        assertNotNull(button);
        assertNotNull(checkbox);
        assertTrue(button instanceof DarkButton);
    }
}