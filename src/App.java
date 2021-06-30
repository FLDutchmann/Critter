import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the critter's name?");
        String name = scanner.nextLine();
        Critter bob = new Critter(name);
        while (bob.isAlive()) {
            System.out.println("What would you like " + name + " to do?");
            String lineRead = scanner.nextLine();
            if (lineRead.equalsIgnoreCase("eat")) {
                bob.feed();
            } else if (lineRead.equalsIgnoreCase("sleep")) {
                bob.sleep();
            }
        }
        System.out.println(name + " has died.");
        scanner.close();
    }
}
