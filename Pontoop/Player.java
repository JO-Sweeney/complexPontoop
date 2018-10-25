package Pontoop;

import java.util.ArrayList;

public class Player {
	
	protected ArrayList <Card> mHand;
	
	public Player() {
		mHand = new ArrayList<Card>();
	}
	
	public void addCard(Card newCard) {
		mHand.add(newCard);
	}
	
	public int getHandValue() {
		int handValue = 0;
		for(int i = 0; i < mHand.size(); i++) {
			handValue = handValue + mHand.get(i).getValue();		//goes through each index of arraylist, accesses object at i, and gets value for that object
		}
		return handValue;
	}
	
	public ArrayList returnHand() {
		return mHand;
	}

}
