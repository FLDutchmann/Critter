public class Dog extends Critter{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Brrrrr...");
        super.sleep();
    }

    @Override
    public void feed(Food food) {
        System.out.println("Woof!");
        super.feed(food);
    }

    @Override
    public void exercise() {
        System.out.println("Wroof, Wroof!");
        super.exercise();
    }
}
