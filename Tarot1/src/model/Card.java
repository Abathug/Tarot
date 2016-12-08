package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/*** Ordre des cartes : Spades > Hearts > Tiles > Clover ***/
public class Card {
	
	private String color;
	private int value;
	private String name="Name";
	private Image image;
	private static int width = 30;
	private static int height = 60;
	private int x;
	private int y;
	
	
	
	// constructor
	public Card(String imageName, int x, int y) {
        
		this.name = imageName;
		this.image = new Image(imageName);
		setX(x);
		setY(y);
		
		
    }
	
	private void setY(int y) {
		this.y=y;
		
	}

	private void setX(int x) {
		this.x=x;
		
	}

	// methods
	
	public String getColor(){
		return color;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getFileName() {
		return name;
	}
	
	
	public void setImage(String imageName)
	{
		this.image = new Image(imageName);
	}
	
	public void returnCard(boolean face)
	{
		setFace();
	}
	
	private void setFace() {

		setImage(name);
			
	}

}
