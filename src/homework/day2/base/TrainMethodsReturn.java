package homework.day2.base;

public class TrainMethodsReturn {
    public static void returnNewInt() {
        int x = 2;
        int y = x * 3;
        System.out.println("метод returnNewInt вернул" + " " + y);
    }

    public static void returnNewLong() {
        long x = 2255225522L;
        long y = x - 4;
        System.out.println("метод returnNewLong вернул" + " " + y);
    }

    public static void returnNewChar() {
        char x = '%';
        System.out.println("метод returnNewChar вернул" + " " + x + "" + x);
    }

    public static void returnNewFloat() {
        float x = 0.5f;
        float y = x / 2;
        System.out.println("метод returnNewFloat вернул" + " " + y);
    }

    public static void returnNewDouble() {
        double x = 33333.3333333333333d;
        double y = x + 8;
        System.out.println("метод returnNewDouble вернул" + " " + y);
    }

    public static void returnNewShort() {
        short x = 32;
        int y = x - 1;
        System.out.println("метод returnNewShort вернул" + " " + y);
    }

    public static void returnNewByte() {
        byte x = 10;
        int y = x * 1;
        System.out.println("метод returnNewByte вернул" + " " + y);
    }

    public static void returnNewBoolean() {
        boolean x = true;
        Boolean y;
        y = !x;
        System.out.println("метод returnNewBoolean вернул" + " " + y);
    }


}
