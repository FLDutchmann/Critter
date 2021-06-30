public class Banana implements Food {
    @Override
    public void applyFood(Critter creature) {
        creature.addToFoodLevel(1);
        if(creature.isAlive()) creature.addToTiredness(1);
    }
}
