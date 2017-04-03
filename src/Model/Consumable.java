package Model;

public class Consumable extends Item{
	
	private String consumableDescription;
	
	public Consumable(int itemID, String itemName, String consumableDescription) {
		super(itemID, itemName);
		this.consumableDescription = consumableDescription;
	}

	public String getConsumableDescription() {
		return consumableDescription;
	}	
	
	public void useItem() {
		System.out.println("Item is used! Your Healed!");
	}
	
	public void pickUp() {
		System.out.println("You picked up a consumable item!");
	}

}
