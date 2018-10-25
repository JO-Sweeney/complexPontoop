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
		int counter = 0;									//this counts the number of games we've played
		do {	
		Game newGame = new Game();						//Create a new game (runs the whole game process)
		addResult(newGame.getResult());					//Get the result of the game and change either mWin, mDraw or mLoss
		counter++;										//Increase games played by 1
		}while (counter < 5 && playAgain());				//only start a game while we've played no more than 5, and the user chooses to play again
		closegameKboard();						
	}
	
	
	//returns true if the player wants to play again ^ see above method for while loop condition
	public boolean playAgain() {
		
		System.out.println("Play another game? Y/N");	
		String choice = gameKboard.next();
		if(choice.equalsIgnoreCase("Y")) {
			return true;
		}else {
			return false;
		}
	}
	
	//Purely to call on the function to close the game scanner
	public void closegameKboard() {
		gameKboard.close();
	}
	
	//takes the result from a game (see rungame - Game.getResult() method) and alters the member variables dependent on the condition 
	public void addResult(String result) {
		if (result.equalsIgnoreCase("win")) {
			mWin++;
		}else if(result.equalsIgnoreCase("draw")) {
			mDraw++;
		}else if(result.equalsIgnoreCase("loss")) {
			mLoss++;
		}
	}
	
	//prints the full results from each game's result combined 
	public void printResults() {
		System.out.println("Wins: "+mWin);
		System.out.println("Draws: "+mDraw);
		System.out.println("Losses: "+mLoss);
	}

}
