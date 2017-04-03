package Model;

public class Monster extends Character
{
	private String monsterDescription;
	private boolean isDefeated;
	
	public Monster(int characterID, int attackPoints, int healthPoints, int defensePoints, String monsterDescription, boolean isDefeated)
	{
		super(characterID, attackPoints, healthPoints,defensePoints);
		this.monsterDescription = monsterDescription;
		this.isDefeated = isDefeated;	
	}

	public String getMonsterDescription() {
		return monsterDescription;
	}

	public boolean isDefeated() {
		return isDefeated;
	}

	public void setDefeated(boolean isDefeated) {
		this.isDefeated = isDefeated;
	}
}
