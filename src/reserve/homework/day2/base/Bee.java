package reserve.homework.day2.base;

public class Bee {
    private String name;
    private long weight;

    public Bee(String name, long weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public void printBeeDetails() {
        long mooseWeight = 500000000L;
        long weightDifference = mooseWeight / weight;
        System.out.println("Я легче лося в " + weightDifference + " раз");
    }
}
