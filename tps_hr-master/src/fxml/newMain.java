package fxml;

import tps_hr.*;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class newMain extends Application{
	protected Stage stage;
	protected Employee user;
	protected TPS tps = new TPS();
	@Override
    public void start(Stage primaryStage) throws Exception{
		this.stage = primaryStage;
        try {
        	Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        	stage.setTitle("The Practical Solution Co.,Ltd");
            stage.setScene(new Scene(root, 600, 400));
            stage.show();
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
    }


    public static void main(String[] args) {
        launch(args);
    }
    
    public void switchScene(String fxmlFile)
    {

        FXMLLoader loader = new FXMLLoader(getClass()
                .getResource(fxmlFile));
        Parent root;
        try 
        {
            root = (Parent)loader.load();
            this.stage.setScene(new Scene(root));
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
