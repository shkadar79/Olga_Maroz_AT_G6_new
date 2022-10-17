package main.java.classwork.day6;

public class ObjectContainer {
    Object[] container = new Object[10];
    private int place = 0;

    public void add(Object incoming) {
        if (place < 10) {
            container[place++] = incoming;
        }
    }

    public Object removeLast() {
        Object last = container[place - 1];
        container[place-- - 1] = null;
        return last;

    }

    public boolean isEmpty() {
        return place == 0;

    }
}
