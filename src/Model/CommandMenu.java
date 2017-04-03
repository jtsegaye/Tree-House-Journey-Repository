
package Model;

public class CommandMenu {
	
	public void save(){
		System.out.println("Game Saved!");
	}
	
	public void load() {
		System.out.println("Game Loaded to Current State!");
	}
	
	public void getHelpMenu() {
		System.out.println("Help Menu Accessed!");
	}
	
	public void newGame() {
		System.out.println("Your in a New Game - Refresh!");
	}
	
	public void exit() {
		System.out.println("Goodbye. Game exited!");
		System.exit(0);
	}
	
	public void showScore() {
		System.out.println("Score: x");
	}
	
}
