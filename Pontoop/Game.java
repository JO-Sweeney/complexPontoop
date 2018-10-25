package Pontoop;

public class Game {
	
	private Deck mDeck;				//Object deck - which has the array of the deck, along with other parts to create the array and contents
	private Dealer mDealer;			//Dealer player
	private User mUser;				//User player
	private String mResult;			//Stores the result of the game to be returned later
	
	public Game() {					
		
		mDeck = new Deck();											
		mDealer = new Dealer(mDeck.getCard(), mDeck.getCard());	//dealer gets a random value card twice to initialise the dealers hand with 2 cards
		mUser = new User();											
		do {
			//give user a random card - done differently because not in the constructor
			mUser.addCard(mDeck.getCard());						
		}while(mUser.getHandValue() < 22 && mUser.userChoice()); //while returned hand value is less than 22 and returned choice is true
		decideResult();
	
	}
	
	//Displays the user and dealer hand, and decides whether a win, draw or loss, displaying this to the user
	//Also alters the result member variable - to be returned in getResult() 
	public void decideResult() {
		
		System.out.println("\nYour hand was "+mUser.getHandValue());
		System.out.println("The dealer had "+mDealer.getHandValue());
		if (mUser.getHandValue() < 22 && mUser.getHandValue() > mDealer.getHandValue()) {
			System.out.println("You win!");
			mResult = "win";
		}else if(mUser.getHandValue() < 22 && mUser.getHandValue() == mDealer.getHandValue()) {
			System.out.println("Its a draw!");
			mResult = "draw";
		}else {
			System.out.println("You lose!");
			mResult = "loss";
		}
	}
	
	public String getResult() {
		return mResult;
	}

}
