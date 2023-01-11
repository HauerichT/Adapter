import java.util.ArrayList;

public class StackAdapter<T> implements GenericStack<T> {

    // Stack Array-List deklarieren
    private final ArrayList<T> stack;

    // Konstruktor
    StackAdapter() {
        // Stack Array-List initialisieren
        this.stack = new ArrayList<>();
    }

    // Methode prüft, ob Stack leer ist
    @Override
    public boolean empty() {
        return stack.isEmpty();
    }

    // Methode legt ein neues Objekt auf den Stack
    @Override
    public T push(T item) {
        stack.add(item);
        return item;
    }

    // Methode entfernt das oberste Objekt vom Stack und gibt das Element zurück
    @Override
    public T pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack leer!");
        }
        return stack.remove(stack.size()-1);
    }

    // Methode gibt das oberste Objekt vom Stack zurück
    @Override
    public T peek() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack leer!");
        }
        return stack.get(stack.size()-1);
    }
}
