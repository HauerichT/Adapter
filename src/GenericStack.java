public interface GenericStack<T> {
    // Methoden deklarieren
    boolean empty();
    T push(T item);
    T pop();
    T peek();
}
