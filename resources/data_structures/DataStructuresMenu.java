package resources.data_structures;

import resources.Menu;

public class DataStructuresMenu extends Menu {
    @Override
    protected void displayAdditionalOptions() {
        System.out.println("3. Practice Specific Data Structure Methods");
        System.out.println("4. Practice Specific Data Structure Time Complexities");
    }

    @Override
    protected String getMenuTitle() {
        return "Data Structures Menu";
    }

    @Override
    protected String getMenuItemLabelPlural() {
        return "Data Structures";
    }
}
