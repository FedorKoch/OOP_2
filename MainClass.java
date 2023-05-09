public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 105);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.setFood(plate.getFood() - cat.getAppetite());
    }
}
