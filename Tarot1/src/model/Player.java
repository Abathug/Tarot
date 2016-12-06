package model;

import java.util.ArrayList;

public class Player {
	
	private ArrayList<Card> hand = new ArrayList<Card>();
	
	//constructor
	
	public Player()
	{
		
	}
	
	// methods
	
	public void addCard(Card card)
	{
		hand.add(card);
	}
	
	public ArrayList<Card> getHand()
	{
		return hand;
	}
	
	

}
