package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    final int WIDTH = 1280;
    final int HEIGHT = 720;

    @Override
    public void start(Stage primaryStage) throws Exception{

        BorderPane bPane = new BorderPane();

        GridPane gridStats = genStatGrid();
        GridPane gridIVPredict = genIVPredictGrid();


        bPane.setLeft(gridStats);
        bPane.setRight(gridIVPredict);


        primaryStage.setTitle("Pokemon IV Calculator");
        primaryStage.setScene(new Scene(bPane, WIDTH, HEIGHT));
        primaryStage.setResizable(false);
        primaryStage.show();

    }


    /**
     * Creates the stat input gridpane
     * @return
     */
    private GridPane genStatGrid() {

        GridPane result = new GridPane();



        return result;
    }

    /**
     * Creates the gridpane for showing the IV predictions
     * @return
     */
    private GridPane genIVPredictGrid() {
        GridPane result = new GridPane();

        return result;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
