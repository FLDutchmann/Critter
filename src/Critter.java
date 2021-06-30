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

    public void addToFoodLevel(int amount) {
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

    public void addToTiredness(int amount) {
        tiredness += amount;
        if (tiredness > 5) {
            System.out.println(name + " is sleepy from so much food.");
            sleep();
        }

    }

    public void addToFitness(int amount) {
        if(fitness >= 10 && isAlive) {
            System.out.println(name + " is in great shape.");
            win();
        }
    }

    public void sleep() {
        System.out.println(name + " sleeps.");
        for(int i = 0; i < 5; i++) {
            System.out.println("Zzz...");
            try { Thread.sleep(1000); }
            catch (InterruptedException e) {}
        }
        tiredness = 0;
        addToFoodLevel(-3);
    }

    public void feed(Food food) {
        if (isAlive) {
            System.out.println(name + " eats.");
            food.applyFood(this);
        }
    }

    public void exercise() {
        System.out.println(name + " exercises.");

        addToTiredness(2);
        if(isAlive) addToFitness(1);
    }
}