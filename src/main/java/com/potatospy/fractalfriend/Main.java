package com.potatospy.fractalfriend;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;


public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{


        String mainwindow = "/fxml/ui.fxml";

        Parent root = null;
        URL mainwindowUrl = null;

        try {

            mainwindowUrl = getClass().getResource(mainwindow);
            root = FXMLLoader.load(mainwindowUrl);
            System.out.println(" mainwindow = " + mainwindow);

        }catch (Exception ex){
            System.out.println( "Exception on FXMLLoader.load()" );
            System.out.println( "  * url: " + mainwindowUrl );
            System.out.println( "  * " + ex );
            System.out.println( "    ----------------------------------------\n" );
            throw ex;
        }

       // Parent root = FXMLLoader.load(getClass().getResource("fxml/ui.fxml"));
        primaryStage.setTitle("Fractal Friend");
        primaryStage.setScene(new Scene(root, 1200, 700));
        primaryStage.show();
    }
}
