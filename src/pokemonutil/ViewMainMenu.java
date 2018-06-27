package pokemonutil;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;

import java.util.ArrayList;


public class ViewMainMenu
{

    private static int height = Main.HEIGHT;
    private static int width = Main.WIDTH;
    private static String title = "Pokemon Utility - Main Menu";


    /**
     * Generates the main menu of the program
     */
    public static Scene SceneMainMenu()
    {
        //  the BorderPane
        BorderPane bPaneMain = new BorderPane();

        //  The Grid of screen selection buttons
        GridPane gridSceneSelect = genGridSceneSelect();
        GridPane gridTopDetails = genGridTop();
        GridPane gridBufferLeft = genBufferGrid();
        GridPane gridBufferRight = genBufferGrid();
        GridPane gridBottomDetails = genBottomGrid();


        // Adding stuff to BorderPane
        bPaneMain.setCenter(gridSceneSelect);   bPaneMain.setAlignment(bPaneMain.getCenter(), Pos.CENTER);
        bPaneMain.setTop(gridTopDetails);
        bPaneMain.setRight(gridBufferRight);
        bPaneMain.setLeft(gridBufferLeft);
        bPaneMain.setBottom(gridBottomDetails);

        //  Put it all together
        Main.mainLabel = title;
        Scene mainMenuScene = new Scene(bPaneMain, width, height);
        return mainMenuScene;
    }

//////////////
///GRIDPANE///
//////////////

    /**
     * Generates a GridPane with buttons to change the scene
     *
     * @return pane, the generated GridPane
     */
    private static GridPane genGridSceneSelect()
    {
        GridPane pane = new GridPane();

        pane.add(ShinyButton("Shiny Counter"), 0, 0);
        pane.add(IVButton("IV Calculator"), 1, 0);
        pane.add(StatButton("Stat Lookup"), 2, 0);
        pane.add(EmptyButton("Empty!"), 3, 0);

        ArrayList<ColumnConstraints> buttonCol = new ArrayList<>();
        ArrayList<RowConstraints> buttonRow = new ArrayList<>();

        for(int i = 0; i < 4; i++)
        {
            ColumnConstraints newCol = new ColumnConstraints();
            newCol.setPercentWidth(25);
            newCol.setHgrow(Priority.ALWAYS);
            newCol.setFillWidth(true);
            buttonCol.add(newCol);

            RowConstraints newRow = new RowConstraints();
            newRow.setPercentHeight(25);
            newRow.setVgrow(Priority.ALWAYS);
            newRow.setFillHeight(true);
            buttonRow.add(newRow);
        }

        pane.getColumnConstraints().addAll(buttonCol.get(0), buttonCol.get(1), buttonCol.get(2), buttonCol.get(3));
        pane.getRowConstraints().addAll(buttonRow.get(0), buttonRow.get(1), buttonRow.get(2), buttonRow.get(3));

        for(int i = 0; i < pane.getChildren().size(); i++)
        {
            GridPane.setFillHeight(pane.getChildren().get(i), true);
            GridPane.setFillWidth(pane.getChildren().get(i), true);
        }

        return pane;
    }

    /**
     * Generates the top grid
     * @return the top grid of the scene
     */
    private static GridPane genGridTop()
    {
        GridPane pane = new GridPane();

        for(int i = 0; i < 3; i++)
        {
            pane.getColumnConstraints().add(new ColumnConstraints(Main.WIDTH / 3));
        }

        int padding = (Main.WIDTH%3) / 2;

        pane.setPadding(new Insets(0, padding, 0, padding));

        pane.getRowConstraints().add(new RowConstraints(Main.HEIGHT / 6));

        return pane;
    }

    /**
     * Generates a Buffer Grid for left and right.
     * @return the left and right grids
     */
    private static GridPane genBufferGrid()
    {
        GridPane pane = new GridPane();

        pane.getRowConstraints().add(new RowConstraints(Main.HEIGHT / 6));
        pane.getColumnConstraints().add(new ColumnConstraints(Main.WIDTH / 6));

        return pane;
    }

    /**
     * Generates another buffer grid
     * @return
     */
    private static GridPane genBottomGrid()
    {
        GridPane pane = new GridPane();

        for(int i = 0; i < 3; i++)
        {
            pane.getColumnConstraints().add(new ColumnConstraints(Main.WIDTH / 3));
        }

        int padding = (Main.WIDTH%3) / 2;

        pane.setPadding(new Insets(0, padding, 0, padding));

        pane.getRowConstraints().add(new RowConstraints(Main.HEIGHT / 6));

        return pane;
    }

//////////////
///BUTTONS////
//////////////
   /**
     * @param buttonText
     * @return a Button for switching to the Shiny Counter scene
     */
    private static Button ShinyButton(String buttonText) {
        Button button = new Button(buttonText);
        button.setWrapText(true);

        button.setOnAction( e -> {
            ControllerShinyCounter.setScene();
        });

        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        return button;
    }

    /**
     * @param buttonText
     * @return a Button for switching to IV Calculator scene
     */
    private static Button IVButton(String buttonText) {
        Button button = new Button(buttonText);
        button.setWrapText(true);

        button.setOnAction( e -> {

        });
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        return button;
    }

    /**
     * @param buttonText
     * @return a Button for switching to Stat Lookup scene
     */
    private static Button StatButton(String buttonText) {
        Button button = new Button(buttonText);
        button.setWrapText(true);

        button.setOnAction( e -> {

        });
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        return button;
    }

    /**
     * @param buttonText
     * @return an empty button for testing and filling empty gaps
     */
    private static Button EmptyButton(String buttonText) {
        Button button = new Button(buttonText);
        button.setWrapText(true);

        button.setOnAction( e -> {

        });
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        return button;
    }
}
