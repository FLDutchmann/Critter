public class Chocolate implements Food{
    @Override
    public void applyFood(Critter creature) {
        creature.addToFoodLevel(5);
        if(creature.isAlive()) creature.addToTiredness(1);
        if(creature.isAlive()) creature.addToFitness(-1);
    }
}
