package reserve.homework.day2.base;

public class Pineapple {
    private String grade;
    private float heatCapacity;

    public Pineapple(String grade, float heatCapacity){
        this.grade = grade;
        this.heatCapacity = heatCapacity;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public float getHeatCapacity() {
        return heatCapacity;
    }

    public void setHeatCapacity(float heatCapacity) {
        this.heatCapacity = heatCapacity;
    }
    public void printPineappleDetails(){
        int hamHeatCapacity = 2400;
        if (heatCapacity > hamHeatCapacity) {
            System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
    } else {
            System.out.println("В ветчине тепла запасется больше");
        }
    }
}

