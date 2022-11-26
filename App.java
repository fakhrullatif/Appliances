package com.mycompany.test1;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application{
    Frg frg = new Frg();
    Washing wsh = new Washing();

    @Override  
    public void start(Stage primaryStage)  {    
        Group root = new Group();
        Scene scene = new Scene(root, Color.WHITE);
        Canvas notification = new Canvas(300, 250);
        BorderPane borderPane = new BorderPane();

        Button btn = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        
        btn.setText(" Fridge : ON");
        btn.setStyle("-fx-background-color: #fg00080; ");
        
        btn2.setText("Fridge : OFF");
        btn2.setStyle("-fx-background-color: #ff0000; ");
        
        btn3.setText("Washing : ON");
        btn3.setStyle("-fx-background-color: #fg00080; ");
        
        btn4.setText("Washing : OFF");
        btn4.setStyle("-fx-background-color: #ff0000; ");
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    frg.window();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        btn2.setOnAction((ActionEvent event) -> {
            
        });
        
        btn3.setOnAction((ActionEvent event) -> {
            try {
                    wsh.window();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        });
        
        btn4.setOnAction((ActionEvent event) -> {
        });

        borderPane.setTop(btn);
        borderPane.setLeft(btn2);
        borderPane.setRight(btn3);
        borderPane.setBottom(btn4);
        
        borderPane.setCenter(notification);

        root.getChildren().add(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    

    public static void main(String[] args) {    
        
        launch(args);    
    }
}