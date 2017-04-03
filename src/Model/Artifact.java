//hello
package Model;

public class Artifact extends Item{

	private String artifactDescription;
	
	public Artifact(int itemID, String itemName, String artifactDescription) {
		super(itemID, itemName);
		this.artifactDescription = artifactDescription;
	}
	
	public String getArtifactDescription() {
		return artifactDescription;
	}

	public void pickUp() {
		System.out.println("An artifact was added into your inventory.");
	}

}
