package model;

import java.util.ArrayList;

public class Dog {
	
	private ArrayList<Card> dog = new ArrayList<Card>();
	
	public Dog()
	{
		
	}
	
	public void addCard(Card card)
	{
		dog.add(card);
	}
	
	public ArrayList<Card> getDog()
	{
		return dog;
	}

}
