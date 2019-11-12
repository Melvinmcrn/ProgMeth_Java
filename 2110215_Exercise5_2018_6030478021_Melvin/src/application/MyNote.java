package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyNote extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		//	root pane
		VBox root = new VBox(8);
		root.setPadding(new Insets(10, 5, 10, 5));
		
		//	top section
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_LEFT);
		grid.setVgap(3);
		
		Label topic = new Label("Topic : ");
		grid.add(topic, 0, 0);
		
		TextField topicText = new TextField();
		topicText.setPrefWidth(200);
		grid.add(topicText, 1, 0);
		
		Label date = new Label("Date : ");
		grid.add(date, 0, 1);
		
		DatePicker calendar = new DatePicker();
		calendar.setPrefWidth(150);
		grid.add(calendar, 1, 1);
		
		root.getChildren().add(grid);
		
		//	middle section
		TextArea message = new TextArea();
		root.getChildren().add(message);
		
		//	bottom section
		HBox bottom = new HBox(3);
		bottom.setAlignment(Pos.CENTER_RIGHT);
		
		Button ok = new Button("OK");
		ok.setPrefWidth(60);
		bottom.getChildren().add(ok);
		
		Button clear = new Button("Clear");
		clear.setPrefWidth(60);
		bottom.getChildren().add(clear);
		
		root.getChildren().add(bottom);
		
		//	Handler
		//	ok button
		ok.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Message");
				alert.setHeaderText("Message");
				alert.setContentText("Topic : "+topicText.getText()+"\n"+
										"Date : "+calendar.getValue()+"\n"+
										"Description : "+message.getText());
				alert.showAndWait();
				
			}
		});
		//	clear button
		clear.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				topicText.clear();
				calendar.setValue(null);
				message.clear();
			}
		});
		
		//	Scene
		Scene scene = new Scene(root, 270, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("MyNote");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
