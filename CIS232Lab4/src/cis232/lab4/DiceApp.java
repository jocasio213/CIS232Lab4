package cis232.lab4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DiceApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// load the fxml
		Parent parent = FXMLLoader.load(getClass().getResource("DiceRoll.fxml"));
		//Build the scene graph
		Scene scene = new Scene (parent);
		//set & show the stage 
		primaryStage.setScene(scene);
		primaryStage.setTitle("Dice Roll");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
