package Pontoop;

import java.util.Scanner;

public class GameTracker {
	
	private Scanner gameKboard;
	private int mWin;
	private int mDraw;
	private int mLoss;
	
	public GameTracker() {
		runGame();
	}
	
	public void runGame() {
		gameKboard = new Scanner(System.in);
		int counter = 0;
		do {
		Game newGame = new Game();
		addResult(newGame.getResult());
		counter++;
		}while (counter < 5 && playAgain());
		closegameKboard();
	}
	
	
	public boolean playAgain() {
		
		System.out.println("Play another game? Y/N");
		String choice = gameKboard.next();
		if(choice.equalsIgnoreCase("Y")) {
			return true;
		}else {
			return false;
		}
	}
	
	public void closegameKboard() {
		gameKboard.close();
	}
	
	public void addResult(String result) {
		if (result.equalsIgnoreCase("win")) {
			mWin++;
		}else if(result.equalsIgnoreCase("draw")) {
			mDraw++;
		}else if(result.equalsIgnoreCase("loss")) {
			mLoss++;
		}
	}
	
	public void printResults() {
		System.out.println("Wins: "+mWin);
		System.out.println("Draws: "+mDraw);
		System.out.println("Losses: "+mLoss);
	}

}
