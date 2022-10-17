package reserve.homework.day2.base;

public class TrainMethodString {
    public void printMama() {
        System.out.println("Мама мыла раму");
    }
    public void printPapa() {
        System.out.println("Папа мыла раму");
    }
    private String sentence = "какая-то строка";
    public void printString() {

        System.out.println(sentence);
    }
    private String sentence1 = "какая-то строка";
    public void printMamaString() {
        System.out.println("Мама мыла раму" + " " + sentence1);
    }
}

