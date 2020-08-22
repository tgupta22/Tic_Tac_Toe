import com.sun.corba.se.spi.activation.Server;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TicTacToe_Client extends Application {


    // Setting the Gui Portion text fields , buttons and the images for the User Interface

    Button Clients_Choice, Play_Again, Quit, Submit_IP, Submit_Port;

    HashMap < String, Scene >  sceneMap;

    GridPane Grid;
    HBox l_1, l_2;
    VBox stackup;
    VBox clientBox;

    TextField port_TextField, IP_TextField, s3, s4;

    Scene startScene;

    BorderPane startPane;

    Client client_Connection;

    Server server_Connection;

    Label Port_Label, IP_Label, Score_Label;

    String Check = "";
    String Check_B = "";

    ArrayList<String> ClientArray = new ArrayList <String> ();
    List < String > Result;
    List < String > Score_Card;

    GameInfo gameInfo = new GameInfo ();

    Label Display_The_Winner = new Label ();

    Label lb_wins = new Label();

    ListView <String> Highest_Score = new ListView();

    Button PlayAgain = new Button (" You Can Play Again");
    Button quit = new Button("You can Quit");

    double sceneHeight = 500;
    double sceneWidth = 500;

    // Defining the number of rows and columns on the grid
    int a = 3;
    int b = 3;

    // Could actg as a counter to display the number of wins.

    int Number_of_Wins = 0;
    double gridWidth = sceneWidth / a;
    double gridHeight = sceneHeight / b;

    ArrayList<Rectangle> square = new ArrayList <> ();
    ArrayList<String> Board = new ArrayList <> ();
    ArrayList<String> Marker = new ArrayList <> ();

    int Port_Number;
    int Server_can_pick = -1;

    String IP;
    String Name;

    ListView<String> listItems;
    @Override

    // A Stage in JavaFX is a top-level container that hosts a Scene, which consists of visual elements. The Stage class in the javafx. stage package represents a stage in a JavaFX application. The primary stage is created by the platform and passed to the start(Stage s)
    // method of the Application class.
    public void start ( Stage primaryStage ) throws Exception {


    }


}
