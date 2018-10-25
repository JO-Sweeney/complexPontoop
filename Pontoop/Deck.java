package Pontoop;
import java.util.ArrayList;

public class Deck {

	private ArrayList <Card> mGameDeck;					//Holds the full deck
	private ArrayList <String> mNameArray;				//Holds the names diamonds, hearts, clubs, spades
	private ArrayList <String> mFaceArray;				//Holds face card names - jack, queen, king, ace
	
	public Deck() {
		
		mGameDeck = new ArrayList<Card>();
		mNameArray = new ArrayList<String>();
		mFaceArray = new ArrayList<String>();
		this.setFaces();
		this.setNames();
		this.makeDeck();
		
	}
	
	public void makeDeck() {
		//To get 1 of diamonds, hearts etc, 2 of diamonds hearts etc
		for(int i = 1; i < 11; i++) {					
			mGameDeck.add(new Card(i, i+" of Diamonds"));
			mGameDeck.add(new Card(i, i+" of Hearts"));
			mGameDeck.add(new Card(i, i+" of Clubs"));
			mGameDeck.add(new Card(i, i+" of Spades"));
		}
		
		//To get Jack Queen King of diamonds, hearts etc all equal to 10 
		for(int i = 0; i < 3; i++) {					
				mGameDeck.add(new Card(10, mFaceArray.get(i)+" of Diamonds"));
				mGameDeck.add(new Card(10, mFaceArray.get(i)+ " of Hearts"));
				mGameDeck.add(new Card(10, mFaceArray.get(i)+ " of Clubs"));
				mGameDeck.add(new Card(10, mFaceArray.get(i)+ " of Spades"));
		}
		
		//to get ace of diamonds, hearts etc all equal to 11 (Aces High)
		for(int i = 0; i < mNameArray.size(); i++) {
			mGameDeck.add(new Card(11, mFaceArray.get(3)+" of "+mNameArray.get(i)));
		}

	}
	
	public void setNames() {
		mNameArray.add("Diamonds");
		mNameArray.add("Hearts");
		mNameArray.add("Clubs");
		mNameArray.add("Spades");
	}
	
	public void setFaces() {
		mFaceArray.add("Jack");
		mFaceArray.add("Queen");
		mFaceArray.add("King");
		mFaceArray.add("Ace");	
	}
	
	public void printDeck() {
		//for each card object in the deck array
		for(int i = 0; i < mGameDeck.size(); i++) {
			
			String cardName = mGameDeck.get(i).getName();
			System.out.println(cardName);
			
		}
	}
	
	public ArrayList getDeck() {
		return mGameDeck;
	}
	
	public Card getCard() {
		int i = (int)(Math.random()*52)+1;
		return mGameDeck.get(i);
	}
	
}
