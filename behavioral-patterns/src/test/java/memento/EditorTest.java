package memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EditorTest {
    @Test
    void shouldUndoTextChanged() {
        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory();

        editor.setText("Версия 1");
        history.push(editor.save());

        editor.setText("Версия 2");
        assertEquals("Версия 2", editor.getText());

        editor.restore(history.pop());

        assertEquals("Версия 1", editor.getText());
    }
}
