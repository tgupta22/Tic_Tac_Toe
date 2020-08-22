//
//
//import com.sun.corba.se.spi.activation.Server;
//
//        import java.io.IOException;
//        import java.io.ObjectInputStream;
//        import java.io.ObjectOutputStream;
//        import java.io.Serializable;
//        import java.net.ServerSocket;
//        import java.net.Socket;
//        import java.util.ArrayList;
//        import java.util.Scanner;
//        import java.util.function.Consumer;
//
//public class Scratch {
////}
//
//public class CLIENT extends Thread{
//
//    //all the necessary things we need
//    Socket socketClient;
//    Scanner scanner;
//    ObjectOutputStream out;
//    ObjectInputStream in;
//    int port;
//    String ip;
//    String test;
//    private Consumer<Serializable> callback;
//    ArrayList<ServerSocket> clients = new ArrayList<ServerSocket>();
//    private int count = 1;
//
//    GameInfo info;
//    String temp;
//
//    String data;
//
//
//
//    //Client constructor
//    CLIENT(Consumer<Serializable> call, int portNum, String ipAd){
//        port = portNum;
//        callback = call;
//        info = new GameInfo();
//        ip = ipAd;
//        data = "";
//
//    }
//
//
//
//
//    public void run() {
//        try {
//            //socketClient
//            socketClient= new Socket("127.0.0.1",port);
//            //incoming data and outgoing data
//            out = new ObjectOutputStream(socketClient.getOutputStream());
//            in = new ObjectInputStream(socketClient.getInputStream());
//            socketClient.setTcpNoDelay(true);
//
//            while(true) {
//                System.out.print("start\n");
////                GameInfo check = (GameInfo) in.readObject(); //taking the incoming data and printing to the client
////                data = check.stateGame;
////                temp = data.toString();
//                info = (GameInfo)(Serializable) in.readObject(); //taking the incoming data and printing to the client
//                temp = info.data;
//                System.out.print( temp + "\n");
//                callback.accept(temp);//accepting the data
//                System.out.print("end\n");
////                }
//
//
//            }
//        }
//        catch(Exception e) {}
//    }
//
//    //data sending to the server
//    public void send(String s) {
//
//        try {
//            GameInfo temp5 = new GameInfo();
//            temp5.data = s;
//            out.writeObject(s);
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//
//}
//
////GAMEINFO
//
////Passing info between clients and server:
////        You must implement the GameInfo class. class GameInfo implements
////        Serializable{}
////    You will add serializable data members to this class that keep track of the state of
////        the game( i.e. int p1Points, int p2Points, String p1Plays, String p2Plays ,
////        Boolean have2players…..). This class will be used to send information back and
////        forth between the server and two clients. This is the only way you are allowed to
////        send and receive information.
////import java.io.Serializable;
////        import java.util.ArrayList;
//
////public class ameInfo implements Serializable {
////    /**
////     *
////     */
////
////    private static final long serialVersionUID = 1L;
////    //points
////    int p1Points, p2Points;
////    //move
////    Boolean plays, p2Plays;
////    //if server has to players
////    Boolean have2Players;
////    //if players will play again
////    Boolean p1Again;
////    Boolean p2Again;
////    //if players have left
////    Boolean p1Left;
////    Boolean p2Left;
////    Boolean inChallenge;
////    String data;
////    ArrayList<String> state;
////    String clickedOn;
////    String stateGame;
////    String bestPick;
////    ameInfo()
////    {
////        p1Points = 0;
////        inChallenge = false;
////        p2Points = 0;
////        have2Players = false;
////        plays = false;
////        p2Plays = false;
////        p1Again = false;
////        p2Again = false;
////        p1Left = false;
////        p2Left = false;
////        data = "";
////        state = new ArrayList<>();
////        clickedOn = "";
////        stateGame = "";
////        bestPick = "";
////    }
////
////    public void setState(ArrayList<String> s)
////    {
////        state = s;
////        System.out.print(s);
////    }
////    public ArrayList<String> getState()
////    {
////        System.out.print(state);
////        return state;
////    }
////
////
////
////}
////
/////*
////For the server logic:
////- It will only allow a game to start if there are two clients connected.
////- It will notify a client if they are the only one connected.
////- It will keep track of what each player played.
////- It will evaluate who won each hand.
////- It will evaluate if a client has won the game.
////- It will update each client with the above items in time.
////- It will do all things necessary to run the game.
////It is expected that your server code will open, manage and close all resources needed
////and handle all exceptions in a graceful way. For game play, each client will chose to
////play either Rock, Paper, Scissors, Lizard or Spock and send that choice to the server.
////The server will determine who won and then update each client with what the other
////played and the resulting state of the game. If a client has won the hand and has
////reached three points, the server will send what the other player played, the resulting
////state of the game and require each client to make a choice as to play again or quit. If a
////player quits, the server will end that connection. If one player quits and the other wants
////to play again, the server will notify the client that they must wait for another person to
////connect. If both want to play again, the server will start a new game.
//// */
