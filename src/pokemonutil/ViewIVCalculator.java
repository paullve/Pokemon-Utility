package pokemonutil;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class ViewIVCalculator {

    /**
     * Generates the scene for the IV Calculator
     */
    public static void SceneIVCalculator()
    {

        BorderPane bPane = new BorderPane();


        //  Create the GridPanes
        GridPane gridStats = genStatGrid();
        GridPane gridIVPredict = genIVPredictGrid();


        bPane.setLeft(gridStats);
        bPane.setRight(gridIVPredict);
    }


    /**
     * Creates the stat input gridpane
     * @return
     */
    private static GridPane genStatGrid()
    {
        GridPane result = new GridPane();
        return result;
    }

    /**
     * Creates the gridpane for showing the IV predictions
     * @return
     */
    private static GridPane genIVPredictGrid()
    {
        GridPane result = new GridPane();

        return result;
    }

}
