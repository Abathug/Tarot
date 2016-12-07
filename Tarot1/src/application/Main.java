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
	
	private Model model;
	private View view;

	@Override
	public void start(Stage primaryStage) {
		
//		this.model = new Model();
//		this.view = new View(model);
//		model.setView(view);
		
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
	
	public static void main(String[] args) {
		launch(args);
	}
}
