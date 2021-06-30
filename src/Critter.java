public class Critter {
    private boolean isAlive;
    private int foodLevel;
    private int tiredness;
    private String name;

    public Critter(String name) {
        isAlive = true;
        foodLevel = 5;
        tiredness = 0;
        this.name = name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    private void die() {
        isAlive = false;
    }

    public void sleep() {
        System.out.println(name + " sleeps.");
        tiredness = 0;
        foodLevel -= 3;
        if (foodLevel <= 0) {
            System.out.println(name + " starves to death.");
            die();
        }
    }

    public void feed() {
        if (isAlive) {
            System.out.println(name + " eats.");
            foodLevel++;
            tiredness++;
            if (foodLevel > 10) {
                System.out.println(name + " over ate.");
                die();
            }
            else if (tiredness > 5) {
                System.out.println(name + " is sleepy from so much food.");
                sleep();
            }
        }
    }
}