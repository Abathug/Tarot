package application;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import com.sun.prism.paint.Color;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.CardType;
import model.Model;

public class View implements Observer{
	
	private Model model;
	private Stage window = new Stage();
	private Group root = new Group();
	private Scene scene = new Scene(root,1080,720);
	
	private ArrayList<CardView> imageCard = new ArrayList<>();
	private int cardPosX;
	private int cardPosY;
	private int dogPosX;
	private int dogPosY;
	
	private Button distribute;
	private Button revealHand;
	private Button orderHand;

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void loadImages()
	{
		// escuse
		this.imageCard.add(new CardView("file:./res/ressources/excuse.jpg", CardType.Trump, 0));
		
		// trumps
		
		for (int i=0;i<21;i++)
		{
			this.imageCard.add(new CardView("file:./res/ressources/Trump"+ Integer.toString(i)+".jpg", CardType.Trump, i));
		}
		
		// colors
		for (int i=0; i<14;i++)
		{
			this.imageCard.add(new CardView("file:./res/ressources/Spade"+ Integer.toString(i)+".jpg", CardType.Spade, i));
			this.imageCard.add(new CardView("file:./res/ressources/Heart"+ Integer.toString(i)+".jpg", CardType.Heart, i));
			this.imageCard.add(new CardView("file:./res/ressources/Tile"+ Integer.toString(i)+".jpg", CardType.Tile, i));
			this.imageCard.add(new CardView("file:./res/ressources/Clover"+ Integer.toString(i)+".jpg", CardType.Clover, i));
		}
	}
	
	public View(Model model)
	{
		this.distribute.setLayoutX(50);
		this.distribute.setLayoutY(50);
		this.revealHand.setLayoutX(100);
		this.revealHand.setLayoutY(50);
		this.orderHand.setLayoutX(150);
		this.orderHand.setLayoutY(200);
		
		root.getChildren().add(distribute);
		root.getChildren().add(revealHand);
		root.getChildren().add(orderHand);
		
		window.setTitle("Tarot tamer such wow");
		window.setScene(scene);
		window.show();
	}
	
	

}
