package application;
	
import javafx.application.Application;
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
			Group root = new Group();
			Scene scene = new Scene(root,1080,800,Color.BLUEVIOLET);
			primaryStage.setTitle("Tarot tamer");
			
//			Image urlImage = new Image("Nocide.jpg");
//			ImageView image = new ImageView();
//			image.setImage(urlImage);
//			image.setX(500);
//			image.setY(400);
//			image.setRotate(10);
//			Group cartes = new Group();
			
			
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
			root.getChildren().add(dist);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
