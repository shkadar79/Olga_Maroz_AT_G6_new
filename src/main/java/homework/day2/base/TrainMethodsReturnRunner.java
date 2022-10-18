package main.java.homework.day2.base;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
        System.out.println("метод returnNewInt вернул " + trainMethodsReturn.returnNewInt(6));
        System.out.println("метод returnNewLong вернул " + trainMethodsReturn.returnNewLong(343434));
        System.out.println("метод returnNewChar вернул " + trainMethodsReturn.returnNewChar('%'));
        System.out.println("метод returnNewFloat вернул " + trainMethodsReturn.returnNewFloat(0.5f));
        System.out.println("метод returnNewDouble вернул " + trainMethodsReturn.returnNewDouble(0.66666d));
        System.out.println("метод returnNewShort вернул " + trainMethodsReturn.returnNewShort((short) 22));
        System.out.println("метод returnNewByte вернул " + trainMethodsReturn.returnNewByte((byte) 10));
        System.out.println("метод returnNewBoolean вернул " + trainMethodsReturn.returnNewBoolean(false));

    }
}

