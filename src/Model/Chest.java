package Model;

public class Chest extends Item{

	public Chest(int itemID, String itemName) {
		super(itemID, itemName);
	}
	
	public void open() {
		System.out.println("Chest is now opened!");
	}
}
