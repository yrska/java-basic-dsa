package resources.algorithms;

import resources.Menu;

public class AlgorithmsMenu extends Menu {

    @Override
    protected void displayAdditionalOptions() {
        System.out.println("3. Practice Specific Algorithms");
    }

    @Override
    protected String getMenuTitle() {
        return "Algorithms Menu";
    }

    @Override
    protected String getMenuItemLabelPlural() {
        return "Algorithms";
    }

    @Override
    public void parseObjects() {

    }
}
