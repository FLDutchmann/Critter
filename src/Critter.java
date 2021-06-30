public class Critter {
    private boolean isAlive;
    private boolean hasWon;
    private int foodLevel;
    private int tiredness;
    private int fitness;
    private String name;

    public Critter(String name) {
        isAlive = true;
        hasWon = false;
        foodLevel = 5;
        tiredness = 0;
        this.name = name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean hasWon() {
        return hasWon;
    }

    private void die() {
        isAlive = false;
    }

    private void win() {
        hasWon = true;
    }

    private void addToFoodLevel(int amount) {
        foodLevel += amount;
        if (foodLevel <= 0) {
            System.out.println(name + " starves to death.");
            die();
        }
        if (foodLevel > 10) {
            System.out.println(name + " over ate.");
            die();
        }
    }

    private void addToTiredness(int amount) {
        tiredness += amount;
        if (tiredness > 5) {
            System.out.println(name + " is sleepy from so much food.");
            sleep();
        }

    }

    public void sleep() {
        System.out.println(name + " sleeps.");
        tiredness = 0;
        addToFoodLevel(-3);
    }

    public void feed() {
        if (isAlive) {
            System.out.println(name + " eats.");
            addToFoodLevel(1);
            if(isAlive) addToTiredness(1);
        }
    }

    public void exercise() {
        System.out.println(name + " exercises.");
        fitness++;
        addToTiredness(2);
        if(fitness >= 10 && isAlive) {
            System.out.println(name + " is in great shape.");
            win();
        }
    }
}