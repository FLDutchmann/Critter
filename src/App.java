import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind of critter would you like?");
        String kind = scanner.nextLine();
        System.out.println("What is the critter's name?");
        String name = scanner.nextLine();

        Critter bob = new Critter(name);
        if(kind.equalsIgnoreCase("cat")) {
            bob = new Cat(name);
        } else if(kind.equalsIgnoreCase("dog")) {
            bob = new Dog(name);
        }

        while (bob.isAlive() && !bob.hasWon()) {
            System.out.println("What would you like " + name + " to do?");
            String lineRead = scanner.nextLine();
            if (lineRead.equalsIgnoreCase("eat")) {
                System.out.println("What would you like " + name + " to eat?");
                lineRead = scanner.nextLine();
                if(lineRead.equalsIgnoreCase("banana")){
                    bob.feed(new Banana());
                }
            } else if (lineRead.equalsIgnoreCase("sleep")) {
                bob.sleep();
            } else if (lineRead.equalsIgnoreCase("exercise")) {
                bob.exercise();
            }
        }
        if(!bob.isAlive()) System.out.println(name + " has died.");
        else if (bob.hasWon()) System.out.println(name + " has won the game.");
        scanner.close();
    }
}
