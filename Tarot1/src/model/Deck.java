package model;


import java.util.ArrayList;


public class Deck {
	
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	//constructor
	public Deck()
	{
		// create trumps
    	for (int i=0; i<22; i++)
    	{
    		String card = "fileName" + Integer.toString(i) + ".jpg";
    		Card trump = new Card(card, 200, 300);
    		deck.add(trump);
    		//getChildren().add(trump);
    		
    	}
    	
    	// create Spades
    	for (int i=0; i<14; i++)
    	{
    		String card = "fileName" + Integer.toString(i) + ".jpg";
    		Card spade = new Card(card, 200, 300);
    		deck.add(spade);
    		//getChildren().add(trump);
    	}
    	
    	// create Hearts
    	for (int i=0; i<14; i++)
    	{
    		String card = "fileName" + Integer.toString(i) + ".jpg";
    		Card heart = new Card(card, 200, 300);
    		deck.add(heart);
    		//getChildren().add(trump);
    	}
    	
    	// create Tiles
    	
    	for (int i=0; i<14; i++)
    	{
    		String card = "fileName" + Integer.toString(i) + ".jpg";
    		Card tile = new Card(card, 200, 300);
    		deck.add(tile);
    		//getChildren().add(trump);
    	}
    	
    	// create Clovers
    	for (int i=0; i<14; i++)
    	{
    		String card = "fileName" + Integer.toString(i) + ".jpg";
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
	
	public void shuffle()
	{
		// je sais pas comment faire :/
	}
	
	public void distribution()
	{
		// idem
	}


}
