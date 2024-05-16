package fr.amu.iut.exercice4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Label label;
    private Pane panneau;
    private HBox bas;

    @Override
    public void start(Stage primaryStage) throws Exception {

        root = new BorderPane();

        // Initialisation du label
        label = new Label("Cliquez sur un bouton pour changer la couleur");

        // Partie haute
        HBox haut = new HBox(label);
        haut.setAlignment(Pos.CENTER);
        root.setTop(haut);

        // Partie centre
        panneau = new Pane();
        panneau.setStyle("-fx-background-color: white;");
        root.setCenter(panneau);

        // Partie basse
        bas = new HBox(10);
        vert = new Button("Vert");
        rouge = new Button("Rouge");
        bleu = new Button("Bleu");
        bas.getChildren().addAll(vert, rouge, bleu);
        bas.setAlignment(Pos.CENTER);
        root.setBottom(bas);

        // Définir les gestionnaires d'événements pour les boutons
        vert.setOnAction(event -> {
            nbVert++;
            panneau.setStyle("-fx-background-color: green;");
            label.setText(String.format("Couleur choisie: Vert, Nombre de clics: %d", nbVert));
        });

        rouge.setOnAction(event -> {
            nbRouge++;
            panneau.setStyle("-fx-background-color: red;");
            label.setText(String.format("Couleur choisie: Rouge, Nombre de clics: %d", nbRouge));
        });

        bleu.setOnAction(event -> {
            nbBleu++;
            panneau.setStyle("-fx-background-color: blue;");
            label.setText(String.format("Couleur choisie: Bleu, Nombre de clics: %d", nbBleu));
        });

        root.setPrefSize(400, 200);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Palette de Couleurs");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
