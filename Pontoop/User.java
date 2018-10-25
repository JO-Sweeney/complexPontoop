package Pontoop;

import java.util.Scanner;

public class User extends Player{
	
	Scanner kboard = new Scanner(System.in);
	
	public User() {
		super();
	}
	
	//Add a card similar to superclass method - but always display that card to the user
	//This method means we get a new card passed in from the deck via the game which gets it from the deck
	public void addCard(Card newCard) {
		mHand.add(newCard);
		displayNewCard(newCard);
	}
	
	//take the new card (see above method) and display its name (eg. ace of spades) and value (eg.11)
	public void displayNewCard(Card newCard) {
		System.out.println("You got a "+newCard.getName() );
		System.out.println("Your hand is now "+this.getHandValue());
	} 
	
	//Asks the user if they want another card (used in loop for game), returning true only if they choose y
	public boolean userChoice() {
		System.out.println("Do you want another card? Y/N");
		String choice = kboard.next();
		if(choice.equalsIgnoreCase("Y")) {
			return true;
		}else {
			return false;
		}
	}
	
	public void closeKboard() {
		kboard.close();
	}
	
}
