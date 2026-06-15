package resources.algorithms;

import resources.Menu;

public class AlgorithmsMenu implements Menu {

    @Override
    public void displayMenu() {
        System.out.println("Algorithms Menu:");
        System.out.println("1. View All Algorithms");
        System.out.println("2. Practice Random Algorithms");
        System.out.println("3. Practice Specific Algorithms");
    }
}
