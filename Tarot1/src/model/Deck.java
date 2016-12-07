package model;


import java.util.ArrayList;
import java.util.Collections;


public class Deck {
	
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	//constructor
	public Deck()
	{
		String card="";
		// create trumps
    	for (int i=0; i<22; i++)
    	{
    		if (i==22)
    		{
    			card = "Excuse";
    		}
    		else
    		{
    			card = "Trump" + Integer.toString(i);
    		}
    		
    		Card trump = new Card(card, 200, 300);
    		deck.add(trump);
    		//getChildren().add(trump);
    		
    	}
    	
    	// create Spades
    	for (int i=0; i<14; i++)
    	{
    		card = "Spade" + Integer.toString(i);
    		Card spade = new Card(card, 200, 300);
    		deck.add(spade);
    		//getChildren().add(trump);
    	}
    	
    	// create Hearts
    	for (int i=0; i<14; i++)
    	{
    		card = "Heart" + Integer.toString(i);
    		Card heart = new Card(card, 200, 300);
    		deck.add(heart);
    		//getChildren().add(trump);
    	}
    	
    	// create Tiles
    	
    	for (int i=0; i<14; i++)
    	{
    		card = "Tile" + Integer.toString(i);
    		Card tile = new Card(card, 200, 300);
    		deck.add(tile);
    		//getChildren().add(tile);
    	}
    	
    	// create Clovers
    	for (int i=0; i<14; i++)
    	{
    		card = "Clover" + Integer.toString(i);
    		Card clover = new Card(card, 200, 300);
    		deck.add(clover);
    		//getChildren().add(trump);
    	}
    }
	
	//methods
	
	public int getSize()
	{
		return deck.size();
	}
	
	public void addCard(Card card)
	{
		deck.add(card);
	}
	
	public void shuffle(ArrayList<Card> deck)
	{
		Collections.shuffle(deck);
	}
	
	public void distribution()
	{
		// je vois pas comment faire
	}


}
