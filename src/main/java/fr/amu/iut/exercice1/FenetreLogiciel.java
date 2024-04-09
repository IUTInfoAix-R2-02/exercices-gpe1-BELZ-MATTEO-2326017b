package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane BPP = new BorderPane();


        // Partie Haute
        Menu MFile = new Menu("File");
        MenuItem New = new MenuItem("New");
        MenuItem Open = new MenuItem("Open");
        MenuItem Save = new MenuItem("Save");
        MenuItem Close = new MenuItem("Close");
        MFile.getItems().addAll(New, Open, Save, Close);
        Menu MEdit = new Menu("Edit");
        MenuItem Cut = new MenuItem("Cut");
        MenuItem Copy = new MenuItem("Copy");
        MenuItem Paste = new MenuItem("Paste");
        MEdit.getItems().addAll(Cut,Copy, Paste);
        Menu MHelp = new Menu("Help");
        MenuBar Mn = new MenuBar(MFile, MEdit, MHelp);



        // Partie Gauche
        VBox VBoxLeft = new VBox();
        Label LBt = new Label("Boutons :");
        Button Bt1 = new Button("Bouton 1");
        Button Bt2 = new Button("Bouton 2");
        Button Bt3 = new Button("Bouton 3");
        VBoxLeft.getChildren().addAll(LBt, Bt1,Bt2,Bt3);
        VBoxLeft.setAlignment(Pos.CENTER);
        Separator sep1 = new Separator(Orientation.HORIZONTAL);
        Separator sep2 = new Separator(Orientation.VERTICAL);
        HBox HBoxLeft = new HBox();
        HBoxLeft.getChildren().addAll(VBoxLeft, sep2);
        HBoxLeft.setAlignment(Pos.CENTER);


        // Partie Centre
        VBox VBoxCentre = new VBox();
        HBox H1 = new HBox();
        Label LName = new Label("Name");
        TextField TName = new TextField();
        H1.getChildren().addAll(LName, TName);
        HBox H2 = new HBox();
        Label LEmail = new Label("Email");
        TextField TEmail = new TextField();
        H2.getChildren().addAll(LEmail, TEmail);
        HBox H3 = new HBox();
        Label LPass = new Label("Password");
        TextField TPass = new TextField();
        H3.getChildren().addAll(LPass, TPass);
        VBoxCentre.setAlignment(Pos.CENTER);
        HBox H4 = new HBox();
        Button BS = new Button("Submit");
        Button BC = new Button("Cancel");
        H4.getChildren().addAll(BS, BC);
        H1.setAlignment(Pos.CENTER);
        H2.setAlignment(Pos.CENTER);
        H3.setAlignment(Pos.CENTER);
        H4.setAlignment(Pos.CENTER);
        VBoxCentre.getChildren().addAll(H1, H2, H3, H4);


        // Partie Basse
        VBox VBoxBot = new VBox();
        Label LBot = new Label("Bas de page");
        Separator sepbot = new Separator(Orientation.HORIZONTAL);
        VBoxBot.getChildren().addAll(sepbot, LBot);
        VBoxBot.setAlignment(Pos.CENTER);

        BPP.setTop(Mn);
        BPP.setLeft(HBoxLeft);
        BPP.setCenter(VBoxCentre);
        BPP.setBottom(VBoxBot);

        Scene Sc = new Scene(BPP);
        primaryStage.setScene(Sc);
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("VBox and HBox App");

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);

    }
}