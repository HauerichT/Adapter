public interface GenericStack<T> {

    boolean empty();
    T push(T item);
    T pop();
    T peek();

}
