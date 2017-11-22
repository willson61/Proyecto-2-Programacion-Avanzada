package Proyecto.Proyecto2PAvanzada;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Operador extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
	    	Parent root1 = FXMLLoader.load(getClass().getResource("LecturaArchivo.fxml"));
	    	Scene scene = new Scene(root1);
	    	primaryStage.setScene(scene);
	    	primaryStage.show();
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	}

	public static void main(String[] args) {
		launch(args);
	}
}
