package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        primaryStage.setTitle("Lab1");

        Scene scene = new Scene(root, 400, 300);
        scene.setFill(Color.GRAY);

        Rectangle stick = new Rectangle(196, 150, 10, 120);
        root.getChildren().add(stick);

        Polygon triangle_red = new Polygon(125, 150, 285, 150, 200, 10);
        triangle_red.setFill(Color.RED);
        root.getChildren().add(triangle_red);

        Polygon triangle_white = new Polygon(145, 140, 265, 140, 200, 30);
        triangle_white.setFill(Color.WHITE);
        root.getChildren().add(triangle_white);

        Circle red = new Circle(201,60,12);
        Circle yellow = new Circle(201,92.5,12);
        Circle green = new Circle(201,125,12);

        red.setFill(Color.RED);
        yellow.setFill(Color.YELLOW);
        green.setFill(Color.GREEN);

        root.getChildren().add(red);
        root.getChildren().add(yellow);
        root.getChildren().add(green);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
