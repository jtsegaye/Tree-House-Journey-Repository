package Model;

public class Puzzle
{
	private int puzzleID;
	private String puzzleDescription;
	private boolean isSolved;
	private String solution;
	
	public Puzzle(int puzzleID, String puzzleDescription, boolean isSolved, String solution) {
		this.puzzleID = puzzleID;
		this.puzzleDescription = puzzleDescription;
		this.isSolved = isSolved;
		this.solution = solution;
	}

	public int getPuzzleID() {
		return puzzleID;
	}

	public String getPuzzleDescription() {
		return puzzleDescription;
	}

	public boolean isSolved() {
		return isSolved;
	}

	public void setSolved(boolean isSolved) {
		this.isSolved = isSolved;
	}
	
	public void solve(String userAnswer) {
		if (userAnswer.equalsIgnoreCase(solution)){
			System.out.println("Correct!");
		}
		else {
			System.out.println("Try again");
		}
	}
	
	public void exitPuzzle() {
		System.out.println("Puzzle exited. Your now in the room.");
	}

	@Override
	public String toString() {
		return "Puzzle ID: " + puzzleID + "; Puzzle Description: " + puzzleDescription + "; isSolved:" + isSolved;
	}
	
}
