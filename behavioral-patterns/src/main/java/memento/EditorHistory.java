package memento;

import java.util.Stack;

public class EditorHistory {
    private final Stack<Memento> history = new Stack<>();

    public void push(Memento memento) {
        this.history.push(memento);
    }

    public Memento pop() {
        if (history.isEmpty()) {
            return null;
        }
        return this.history.pop();
    }
}
