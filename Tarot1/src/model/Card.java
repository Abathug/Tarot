package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/*** Ordre des cartes : Spades > Hearts > Tiles > Clover ***/
public class Card extends ImageView{
	
	private String color;
	private int value;
	private String imageFace="Filename";
	private String imageBack="FileName";
	private Image image;
	private static int width = 30;
	private static int height = 60;
	
	
	
	// constructor
	public Card(String imageName, int x, int y) {
        
		this.imageFace = imageName;
		this.image = new Image(imageName);
		setImage(image);
		setFitWidth(width);
		setFitHeight(height);
		setX(x);
		setY(y);
		
		
    }
	
	// methods
	
	public String getColor(){
		return color;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getFileName() {
		return imageFace;
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

		setImage(imageFace);
			
	}

}
