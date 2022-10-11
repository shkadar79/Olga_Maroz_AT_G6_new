package homework.day2.base;

public class TrainMethodIfRunner {
    public static void main(String[] args) {

        TrainMethodIf trainMethodIf = new TrainMethodIf();


        System.out.println("метод returnNewInt вернул " + trainMethodIf.returnNewInt(6));
        System.out.println("метод returnNewLong вернул " + trainMethodIf.returnNewLong(350));

        System.out.println("метод returnNewChar вернул " + trainMethodIf.returnNewChar('h') + "o");
        System.out.println("метод returnNewChar вернул " + trainMethodIf.returnNewChar('g'));

        System.out.println("метод returnNewChar вернул " + trainMethodIf.returnNewFloat(0.77f));
        System.out.println("метод returnNewDouble вернул " + trainMethodIf.returnNewDouble(50));

        trainMethodIf.returnNewBoolean(true);
        System.out.println("я получил на вход значение истины");
        trainMethodIf.returnNewBoolean(false);
        System.out.println("я получил на вход ложь");

    }

}
