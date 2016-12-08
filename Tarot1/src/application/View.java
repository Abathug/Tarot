package application;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import com.sun.prism.paint.Color;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.CardType;
import model.Model;

public class View implements Observer {

	private Model model;
	private Stage window = new Stage();
	private Group root = new Group();
	private Scene scene = new Scene(root, 1080, 720);

	private ArrayList<CardView> imageCard = new ArrayList<>();
	private int cardPosX;
	private int cardPosY;
	private int dogPosX;
	private int dogPosY;

	private Button distribute = new Button();
	private Button revealHand = new Button();
	private Button orderHand = new Button();

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	public void loadImages() {
		// escuse
		this.imageCard.add(new CardView("file:./res/ressources/excuse.jpg", CardType.Trump, 0));

		// trumps

		for (int i = 0; i < 21; i++) {
			this.imageCard
					.add(new CardView("file:./src/ressources/" + Integer.toString(i) + ".jpg", CardType.Trump, i));
		}

		// colors
		for (int i = 0; i < 14; i++) {
			this.imageCard
					.add(new CardView("file:./src/ressources/Spade" + Integer.toString(i) + ".jpg", CardType.Spade, i));
			this.imageCard
					.add(new CardView("file:./src/ressources/Heart" + Integer.toString(i) + ".jpg", CardType.Heart, i));
			this.imageCard
					.add(new CardView("file:./src/ressources/Tile" + Integer.toString(i) + ".jpg", CardType.Tile, i));
			this.imageCard.add(
					new CardView("file:./src/ressources/Clover" + Integer.toString(i) + ".jpg", CardType.Clover, i));
		}
	}

	public View(Model model) {
		
		this.distribute.setText("Distribute");
		this.revealHand.setText("Reaveal Hand");
		this.orderHand.setText("Order Hand");
		this.distribute.setLayoutX(50);
		this.distribute.setLayoutY(50);
		this.revealHand.setLayoutX(150);
		this.revealHand.setLayoutY(50);
		this.orderHand.setLayoutX(250);
		this.orderHand.setLayoutY(50);
		
		

		loadImages();

		imageCard.forEach(card -> {

			this.root.getChildren().add(card);
			card.setVisible(true);
			card.setFitHeight(240);
			card.setFitWidth(120);
			card.setTranslateX(50);
			card.setTranslateY(200);
		});

		root.getChildren().add(distribute);
		root.getChildren().add(revealHand);
		root.getChildren().add(orderHand);

		window.setTitle("Tarot tamer such wow");
		window.setScene(scene);
		window.show();
	}

}
