package main.java.homework.day2.base;

import static java.lang.System.out;

public class TrainMethodsObjects {
    public void processMouse() {

        Mouse mouse = new Mouse("Джерри", 7);
        out.println(mouse.getName() + " " + mouse.getAge());
        mouse.printMouseDetails();
    }
    public void processSouce(){
        Souce souce = new Souce("кетчуп", "красного");
        out.println(souce.getName() + " " + souce.getColor());
        souce.printSouceDetails();
     }
    public void processBee() {
        Bee bee = new Bee("Мая", 200);
        out.println(bee.getName() + " " + bee.getWeight());
        bee.printBeeDetails();
    }
    public void processObstacle() {
        Obstacle obstacle = new Obstacle("отключение электричества", "важное");
        out.println(obstacle.getDescription() + " " + obstacle.getSeverity());
        obstacle.printObstacleDetails();
    }
    public void processPineapple() {
        Pineapple pineapple = new Pineapple("свежий", 3680.0f);
        out.println(pineapple.getGrade() + " " + pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();
    }
}
