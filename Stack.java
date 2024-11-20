package mypackage.data_structure_library;

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T item) {
        list.addLast(item);
    }

    public T pop() {
        if (list.isEmpty()) throw new IllegalStateException("Stack is empty");
        return list.removeFirst();
    }

    public T peek() {
        if (list.isEmpty()) throw new IllegalStateException("Stack is empty");
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
