package Model;

public class Room
{
	public int roomID;
	public String roomDescription;
	
	public Room(int roomID, String roomDescription) {
		this.roomID = roomID;
		this.roomDescription = roomDescription;
	}

	public int getRoomID() {
		return roomID;
	}

	public String getRoomDescription() {
		return roomDescription;
	}

	public void examineRoom() {
		System.out.println("List of commands for examining room.");
	}
	
	public void enter() {
		System.out.println("Door is lock!");
	}

	@Override
	public String toString() {
		return "You are inside of room: " + roomID + " Room Description: " + roomDescription + "]";
	}
	
}
