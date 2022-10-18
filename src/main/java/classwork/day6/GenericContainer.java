package main.java.classwork.day6;

public class GenericContainer<T> {
    private T[] container = (T[]) new Object[10];
    private int place = 0;

    public void add(T incoming) {
        if (place < 10) {
            container[place++] = incoming;
        }
    }

    public T removeLast() {
        T last = container[place - 1];
        container[place-- - 1] = null;
        return last;
    }

    public boolean isEmpty() {
        return place == 0;
    }
}

