package application;
	
import model.Card;
import model.Model;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
		
			
			//image de test
			Image urlImage = new Image("file:./src/application/c_bo.png");
			ImageView image = new ImageView();
			image.setImage(urlImage);
			image.setX(500);
			image.setY(400);
			image.setRotate(10);
			//fin image
		
			
			//boutton
			Button dist = new Button();
			dist.setLayoutX(50);
			dist.setLayoutY(50);
			dist.setText("Distribuer bordel");
			dist.setOnAction(new EventHandler<ActionEvent>()
					{

						@Override
						public void handle(ActionEvent event) {
							System.out.println("lama");
							
						}
						
					});
			//fin boutton
			
			//scene
			primaryStage.setTitle("Tarot tamer");
			Group root = new Group();
			Scene scene = new Scene(root,1080,800,Color.BLUEVIOLET);
						
			root.getChildren().add(dist);
			root.getChildren().add(image);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.sizeToScene();
			primaryStage.show();
			//fin scene
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private ObservableList<Card> cardData = FXCollections.observableArrayList();
	
	public Main()
	{
String color = null;
    	
    	for (int i=0; i<21; i++)
    	{
    		// crée les atouts
    	}
    	for (int i=0; i<4; i++)
    	{
    		if (i==0)
    			color = "Coeur";
    		if (i==1)
    			color = "Carreau";
    		if (i==2)
    			color = "Pique";
    		if (i==3)
    			color = "Trèfle";
    		// crée les autres cartes selon leur couleur
    		for (int f=0; f<14; f++)
    		{
    			cardData.add(new Card(color,f,"FileName"));
    		}
    	}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
