package resources.data_structures;

import resources.Menu;

public class DataStructuresMenu implements Menu {
    @Override
    public void displayMenu() {
        System.out.println("Data Structures Menu:");
        System.out.println("1. View All Data Structures");
        System.out.println("2. Practice Random Data Structures");
        System.out.println("3. Practice Specific Data Structure Methods");
        System.out.println("4. Practice Specific Data Structure Time Complexities");
    }
}
