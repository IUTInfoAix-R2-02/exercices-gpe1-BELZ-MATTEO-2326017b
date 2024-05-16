package fr.amu.iut.exercice2;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.util.Random;

public class TicTacToe extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        String[] choix = {"exercice2/Vide.png", "exercice2/Croix.png", "exercice2/Rond.png"};

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                Label label = new Label();
                Random random = new Random();
                int nombre = random.nextInt(3);

                ImageView image = new ImageView(choix[nombre]);;
                label.setGraphic(image);
                label.setStyle("-fx-border-color: gray; "
                        + "-fx-border-width: 2; "

                        + "-fx-padding: 10;");


                //Separator sep1 = new Separator(Orientation.HORIZONTAL);
                //Separator sep2 = new Separator(Orientation.VERTICAL);

                //HBox hbox = new HBox();

                //hbox.getChildren().addAll(image,  sep2);


                grid.add(label, col, row);

            }
        }

        Scene Sc = new Scene(grid);
        primaryStage.setResizable(false);
        primaryStage.setScene(Sc);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
