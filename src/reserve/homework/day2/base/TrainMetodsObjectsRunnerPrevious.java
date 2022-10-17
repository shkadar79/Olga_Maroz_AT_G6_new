package reserve.homework.day2.base;

public class TrainMetodsObjectsRunnerPrevious {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("Мики-Маус", 5);
        mouse.printMouseDetails();

        Souce souce = new Souce("кетчуп", "красного");
        souce.printSouceDetails();

        Bee bee = new Bee("Мая", 200);
        bee.printBeeDetails();

        Obstacle obstacle = new Obstacle("отключение электричества", "важное");
        obstacle.printObstacleDetails();

        Pineapple pineapple = new Pineapple("свежий", 3680.0f);
        pineapple.printPineappleDetails();
    }
}
