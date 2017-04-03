
package Model;

public class Player extends Character
{
	private String playerName;
	private int playerMarker;
	private boolean isDead;
	private String hint;

	public Player(int characterID, int attackPoints, int healthPoints, int defensePoints, String playerName, int playerMarker, boolean isDead, String hint)
	{
		super(characterID, attackPoints, healthPoints,defensePoints);
		this.playerName = playerName;
		this.playerMarker = playerMarker;
		this.isDead = isDead;
		this.hint = hint;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getPlayerMarker() {
		return playerMarker;
	}

	public String getHint() {
		return hint;
	}

	public void useHint()
	{
		System.out.println("Your hint is ...! " +hint);
	}
	
	public void fleeBattle()
	{
		System.out.println("You flee the battle!");
		System.exit(0);
	}
}
