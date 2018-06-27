package pokemonutil;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application
{

    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;

    public static String mainLabel = "Pokemon Utility";

    @Override
    public void start(Stage primaryStage) throws Exception
    {


        primaryStage.setScene(ViewMainMenu.SceneMainMenu());
        primaryStage.setTitle(mainLabel);
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
