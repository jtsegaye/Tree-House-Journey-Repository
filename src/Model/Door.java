
package Model;

public class Door {
	
	private int doorID;
	private boolean isUnlocked;
	
	public Door(int doorID, boolean isUnlocked) {
		this.doorID = doorID;
		this.isUnlocked = isUnlocked;
	}

	public int getDoorID() {
		return doorID;
	}

	public boolean isUnlocked() {
		return isUnlocked;
	}
	
	public void setUnlocked(boolean isUnlocked) {
		this.isUnlocked = isUnlocked;
	}

	@Override
	public String toString() {
		return "Access granted if door is unlocked else go get a key.";
	}
	
}
