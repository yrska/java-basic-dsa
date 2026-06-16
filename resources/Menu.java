package resources;

public abstract class Menu {

	public void displayMenu() {
		System.out.println(getMenuTitle() + ":");
		System.out.println("1. View All " + getMenuItemLabelPlural());
		System.out.println("2. Practice Random " + getMenuItemLabelPlural());
		displayAdditionalOptions();
	}

	protected abstract String getMenuTitle();

	protected abstract String getMenuItemLabelPlural();

	protected void displayAdditionalOptions() {
	}

	public void parseObjects() {
	}
}
