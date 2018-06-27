package pokemonutil;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class ViewMainMenu {

    private static int height = Main.HEIGHT;
    private static int width = Main.WIDTH;

    /**
     * Generates the main menu of the program
     */
    public static Scene SceneMainMenu() {

        BorderPane bPaneMain = new BorderPane();



        Scene mainMenuScene = new Scene(bPaneMain, width, height);
        return mainMenuScene;
    }

}
