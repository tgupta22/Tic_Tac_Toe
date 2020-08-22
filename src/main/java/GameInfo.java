import java.io.Serializable;
        import java.util.ArrayList;

public class GameInfo {
    public String data;

    // During serialization, java runtime associates a version number with each serializable class. This number called serialVersionUID, which is used during deserialization
    // to verify that the sender and receiver of a serialized object have loaded classes for
    // that object that are compatible with respect to serialization.

    private static final long serialVersionUID = 1L;
    int p1Points, p2Points;
    boolean p1Plays, p2Plays;
    boolean has2Players;
    boolean p1Again, p2Again;
    boolean p1Left, p2Left;
    boolean inChallenge;
    ArrayList<String> state;
    String clicked_Move;
    String gameState;
    String bestPick;


    GameInfo(){
        p1Points = 0;
        p2Points = 0;

        data = "";
        state = new ArrayList<String>();
        clicked_Move = "";
        gameState = "";
        bestPick = "";

        p1Plays = false;
        p2Plays = false;

        has2Players = false;

        p1Again = false;
        p2Again = false;

        p1Left = false;
        p2Left = false;

        inChallenge = false;

    }

    // Setting the State of the game.
    public void gameState(ArrayList<String> state1)
    {
        state = state1;
        System.out.print(state1 );
    }

    public ArrayList<String> getState(){

        System.out.print(state);
        return state;
    }



}
