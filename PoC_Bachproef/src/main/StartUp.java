package main;

import gui.OverzichtSchermController;
import gui.OverzichtSchermTileController;
import javafx.application.Application;
import domein.DomeinController;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartUp extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
    	OverzichtSchermController ovc = new OverzichtSchermController(new DomeinController());

        Scene scene = new Scene(ovc);
        primaryStage.setTitle("Overzicht");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
