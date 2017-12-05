package control;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlFX {

	MainFX main;
	Stage stage;
	/**
	 * Metodo para abrir una nueva ventana
	 */
	@FXML
    private void crearVentana() {
    	showSendProfile();
    }
	/**
	 * Metodo para cerrar una ventana
	 */
	@FXML
    private void cerrarVentana() {
		System.exit(0);
    }
	
	public void showSendProfile() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainFX.class.getResource("../vista/Intro.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Superheader");
            
            
            Scene scene = new Scene(page);
             sendStage.setScene(scene);

            
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void main(Stage stage, MainFX main) {
		this.main = main;
		this.stage = stage;
	}
}
