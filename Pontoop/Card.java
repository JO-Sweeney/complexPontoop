package Pontoop;

public class Card {
	
	private int mValue;
	private String mName;
	
	public Card(int value, String name) {
		mValue = value;
		mName = name;
	}
	
	public void setValue(int value) {
		mValue = value;
	}
	
	public int getValue() {
		return mValue;
	}
	
	public String getName() {
		return mName;
	}
	
}
