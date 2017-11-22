package Proyecto.Proyecto2PAvanzada;
/**
 * @author Will
 */
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MostrarGrafosController implements Initializable{
	@FXML
	private ImageView imgView1;
	@FXML
	private Label lbl1;
	@FXML
	private ImageView imgView2;
	@FXML
	private Label lbl2;
	@FXML
	private ImageView imgView3;
	@FXML
	private Label lbl3;
	@FXML
	private ImageView imgView4;
	@FXML
	private Label lbl4;
	@FXML
	private ImageView imgView5;
	@FXML
	private Label lbl5;
	@FXML
	private ImageView imgView6;
	@FXML
	private Label lbl6;
	@FXML
    private Button btnCrear;
    @FXML
    public Button btnMostrar;

    @FXML
    /**
     * Metodo de boton btnCrear que crea los grafos si las estructuras de datos
     * poseen algun dato
     * @param event
     */
    void crearGrafos(ActionEvent event) {
    	Structures.crearEstructuras();
		if(Main.listStack.size() > 0) {
			try {
				Structures.crearStackGrafo();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(Main.listQueue.size() > 0) {
			try {
				Structures.crearQueueGrafo();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(Main.listLinked.size() > 0) {
			try {
				Structures.crearLinkedListGrafo();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(Main.listDoubeLinked.size() > 0) {
			try {
				Structures.crearDoubleLinkedListGrafo();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(Main.listCircularLinked.size() > 0) {
			try {
				Structures.crearCircularLinkedListGrafo();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(Main.listBinaryTree.size() > 0) {
			try {
				Structures.crearBinaryTreeGrafo();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Alert alert1 = new Alert(AlertType.INFORMATION);
		alert1.setTitle("Estado Grafo");
		alert1.setHeaderText(null);
		alert1.setContentText("Grafos Creados");
		alert1.showAndWait();
		btnMostrar.setVisible(true);
		btnCrear.setVisible(false);
    }

    @FXML
    /**
     * Metodo de boton btnMostrar que muestra los grafos creados
     * @param event
     */
    void mostrarGrafos(ActionEvent event) {
    	File file = new File("example/grafoStack.png");
    	Main.grafStack = new Image(file.toURI().toString());
    	imgView1.setImage(Main.grafStack);
    	file = new File("example/grafoQueue.png");
    	Main.grafQueue = new Image(file.toURI().toString());
    	imgView2.setImage(Main.grafQueue);
    	file = new File("example/grafoLinkedList.png");
    	Main.grafLinkedList = new Image(file.toURI().toString());
    	imgView3.setImage(Main.grafLinkedList);
    	file = new File("example/grafoDoubleLinkedList.png");
    	Main.grafDoubleLinked = new Image(file.toURI().toString());
    	imgView4.setImage(Main.grafDoubleLinked);
    	file = new File("example/grafoCircularLinkedList.png");
    	Main.grafCircularLinked = new Image(file.toURI().toString());
    	imgView5.setImage(Main.grafCircularLinked);
    	file = new File("example/grafoBinaryTree.png");
    	Main.grafBinaryTree = new Image(file.toURI().toString());
    	imgView6.setImage(Main.grafBinaryTree);
    	
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		btnMostrar.setVisible(false);
	}

}
