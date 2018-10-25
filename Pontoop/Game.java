package Pontoop;

public class Game {
	
	private Deck mDeck;
	private Dealer mDealer;
	private User mUser;
	private String mResult;
	
	public Game() {
		
		mDeck = new Deck();
		mDealer = new Dealer(mDeck.getCard(), mDeck.getCard());
		mUser = new User();
		do {
			mUser.addCard(mDeck.getCard());
		}while(mUser.getHandValue() < 22 && mUser.userChoice());
		decideResult();
	
	}
	
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
