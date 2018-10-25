package Pontoop;

import java.util.Scanner;

public class User extends Player{
	
	Scanner kboard = new Scanner(System.in);
	
	public User() {
		super();
	}
	
	public void addCard(Card newCard) {
		mHand.add(newCard);
		displayNewCard(newCard);
	}
	
	public void displayNewCard(Card newCard) {
		System.out.println("You got a "+newCard.getName() );
		System.out.println("Your hand is now "+this.getHandValue());
	} 
	
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
