package control;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * 
 * @author Jorge Diaz
 * @see control.ControlFX
 * @version 1.0.4
 *
 */
public class MainFX extends Application {
	
	Stage stage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			/*
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			*/
			this.stage=primaryStage;

	        MainWindow();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void MainWindow() {
		
		try {

        	FXMLLoader loader=new FXMLLoader(getClass().getResource("../vista/Login.fxml"));
            AnchorPane pane=loader.load();
            ControlFX controller=loader.getController();
            controller.main(stage,this);
            Scene scene=new Scene(pane);
            stage.setScene(scene);
            stage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
