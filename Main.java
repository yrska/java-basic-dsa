import java.util.Scanner;
import resources.data_structures.DataStructuresMenu;
import resources.algorithms.AlgorithmsMenu;
import resources.Menu;

public class Main {
    
    
    public static void main(String[] args) {
        System.out.println("1: Data Structures");
        System.out.println("2: Algorithms");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.close();

        Menu menu = null;
        if (choice == 1) {
            menu = new DataStructuresMenu();
        } else if (choice == 2) {
            menu = new AlgorithmsMenu();
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
            return;
        }

        menu.displayMenu();


    }


}
