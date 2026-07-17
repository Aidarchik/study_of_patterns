package memento;

public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Memento save() {
        return new Memento(this.text);
    }

    public void restore(Memento memento) {
        if (memento != null) {
            this.text = memento.getTextState();
        }
    }
}
