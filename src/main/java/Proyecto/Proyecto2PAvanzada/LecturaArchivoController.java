package Proyecto.Proyecto2PAvanzada;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import java.io.FileNotFoundException;
import java.io.IOException;


public class LecturaArchivoController {
	@FXML
	private Label lbl1;
	@FXML
	private TextField txtArchivo;
	@FXML
	private Button btnLeer;

	// Event Listener on Button[#btnLeer].onAction
	@FXML
	public void leerArchivo(ActionEvent event) {
		String archivo = txtArchivo.getText();
		if(archivo != null) {
			try {
				Lector.lectura(archivo.trim());
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MostrarGrafos.fxml"));
				Parent root1 = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setScene(new Scene(root1));
				stage.show();
				Stage st = (Stage) btnLeer.getScene().getWindow();
				st.hide();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			Alert alert1 = new Alert(AlertType.INFORMATION);
			alert1.setTitle("Input Error");
			alert1.setHeaderText(null);
			alert1.setContentText("El cuadro de texto no posee ningun dato para continuar con la operacion");
			alert1.showAndWait();
		}
	}
}
