package Model;

public class Character 
{
	private int characterID;
	private int attackPoints;
	private int healthPoints;
	private int defensePoints;
	
	public Character(int characterID, int attackPoints, int healthPoints, int defensePoints)
	{
		this.characterID = characterID;
		this.attackPoints = attackPoints;
		this.healthPoints= healthPoints;
		this.defensePoints = defensePoints;
	}

	public int getCharacterID() {
		return characterID;
	}

	public int getAttackPoints() {
		return attackPoints;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public int getDefensePoints() {
		return defensePoints;
	}
	
	public void getStatus()
	{
		System.out.println(healthPoints + "Health Points, " + attackPoints + " Attack Points, " + defensePoints + " Defense Points"); 
	}
	
	public int attack()
	{
		return attackPoints;
	}
}
