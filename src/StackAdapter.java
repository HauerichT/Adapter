import java.util.ArrayList;
import java.util.Arrays;

public class StackAdapter<T> implements GenericStack<T>{

    private ArrayList<T> stack;

    StackAdapter() {
        this.stack = new ArrayList<>();
    }

    @Override
    public boolean empty() {
        return stack.size() == 0;
    }

    @Override
    public T push(T item) {
        stack.add(item);
        return item;
    }

    @Override
    public T pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack leer!");
        }
        return stack.remove(stack.size()-1);
    }

    @Override
    public T peek() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack leer!");
        }
        return stack.get(stack.size()-1);
    }
}
