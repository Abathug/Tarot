package application;
	
import model.Model;
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	
	private Model model;
	private View view;

	@Override
	public void start(Stage primaryStage) {
		
		this.model = new Model();
		this.view = new View(model);
		model.setView(view);
		

		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
