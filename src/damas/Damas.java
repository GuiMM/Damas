/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damas;

import java.awt.Paint;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author MQGuilherme
 */
public class Damas extends Application {
    int SIZE = 30;  //tamanho de uma casa
    int SIZE2 = 15; //metade de uma casa
    int SIZEP = 12; //raio de uma peca
    
    
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        
        Scene scene = new Scene(root, 300, 250, Color.WHITE);
        // desenhando o tabuleiro
        Rectangle r=null;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                r = new Rectangle(SIZE,SIZE);
                r.setFill(Color.GRAY);
                r.setX(i*2*SIZE);
                r.setY(j*2*SIZE);
                root.getChildren().add(r);
                
                r = new Rectangle(SIZE,SIZE);
                r.setFill(Color.GRAY);
                r.setX(i*2*SIZE+SIZE);
                r.setY(j*2*SIZE+SIZE);
                root.getChildren().add(r);
            }
        }
        
        
        //root.getChildren().add(btn);
        
        r.localToScene(0, 0);
        primaryStage.setTitle("Damas!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
