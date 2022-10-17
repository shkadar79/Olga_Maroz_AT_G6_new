package reserve.classwork.day6;

public class GenericContainer <T> {
        private T[] container = new Object[10];
        private int place = 0;

        public void add(T incoming) {
            if (place < 10) {
                container[place++] = incoming;
            }
        }

        public T removeLast() {
            Object last = container[place - 1];
            container[place-- - 1] = null;
            return last;
        }

    public static class ObjectContainerRunner {
        public static void main(String[] args) {
            ObjectContainer objectContainer = new ObjectContainer();
            objectContainer.add(1234567);
            objectContainer.removeLast();
            objectContainer.isEmpty();
            PrintColor task = new PrintColor();
            task.printColor("blue");

        }
    }
}
