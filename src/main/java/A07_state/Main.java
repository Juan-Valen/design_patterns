package A07_state;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character hero = new Character("Zeus");

        while (true) {
            hero.displayStatus();
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    hero.train();
                    break;
                case 2:
                    hero.meditate();
                    break;
                case 3:
                    hero.fight();
                    break;
                case 0:
                    System.out.println("Exiting game. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.println("\nPress Enter to continue...");
            try {
                System.in.read();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
