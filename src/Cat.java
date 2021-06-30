public class Cat extends Critter{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Purrrr...");
        super.sleep();
    }

    @Override
    public void feed() {
        System.out.println("Meow!");
        super.feed();
    }

    @Override
    public void exercise() {
        System.out.println("Meooooowww...");
        super.exercise();
    }
}
