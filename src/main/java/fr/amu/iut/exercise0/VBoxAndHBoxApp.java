package fr.amu.iut.exercise0;

import javafx.application.Application;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Separator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxAndHBoxApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox VBoxPrincipale = new VBox();

        HBox HBoxTop = new HBox();
        HBoxTop.setAlignment(Pos.BOTTOM_LEFT);
        Button Rf = new Button("Refresh");

        HBox HBoxTop2 = new HBox();
        HBox.setHgrow(HBoxTop2, Priority.ALWAYS);
        HBoxTop2.setAlignment(Pos.BOTTOM_RIGHT);
        Hyperlink SO = new Hyperlink("Sign Out");

        HBoxTop2.getChildren().add(SO);
        HBoxTop.getChildren().addAll(Rf, HBoxTop2);

        TableView<Object> tblCustomers = new TableView<>();
        tblCustomers.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        TableColumn<Object, String> lastNameCol = new TableColumn<>("Last Name");
        TableColumn<Object, String> firstNameCol = new TableColumn<>("First Name");
        tblCustomers.getColumns().addAll( lastNameCol, firstNameCol );
        VBox.setVgrow(tblCustomers, Priority.ALWAYS);

        Separator sep = new Separator();
        HBox HBoxBot = new HBox();
        HBoxBot.setAlignment(Pos.BOTTOM_RIGHT );
        Button Cl = new Button("Close");
        HBoxBot.getChildren().add(Cl);

        VBoxPrincipale.getChildren().addAll(HBoxTop, tblCustomers, sep, HBoxBot);

        Scene Sc = new Scene(VBoxPrincipale);

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
