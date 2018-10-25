package Pontoop;

import java.util.Scanner;

public class Launcher {

	public static void main(String [] args) {
		
		/*
		 Create a new gametracker object called newMatch - this is the first step down the rabbit hole
		- this will create at least one game (up to 5), which will create a deck per game, along with a dealer 
		and a user - both players. Each player has a hand which takes a random card from the created deck. 
		 */
		GameTracker newMatch = new GameTracker();
		newMatch.printResults();
	}
	

	
}
