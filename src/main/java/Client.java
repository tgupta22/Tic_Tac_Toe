import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Client extends Thread {

    // The neccessary items/ toolkit for the project.

    ObjectOutputStream OUT;
    ObjectInputStream IN;

    String ip;
    String test;

    GameInfo info;
    String temp;
    String data;

    Socket socket_Client;
    Scanner scanner;

    int PORT;

    private Consumer< Serializable > callback;
    ArrayList < ServerSocket > clients = new ArrayList<ServerSocket>();
    int counter = 1;


    // Constructing the Client Constructor.

    Client(Consumer<Serializable> call, int port_Num, String ip_Address)
    {
        callback = call;
        info = new GameInfo ();
        ip = ip_Address;
        data = "";
        PORT = port_Num;

    }

    public void run()
    {
        try {

            // Developing a new Socket here with the required host/port number.

            socket_Client = new Socket ("127.0.0.1", PORT);

            // Checking for the incoming and outgoing data from the Client Socket to the Server Socket.

         IN = new ObjectInputStream ( socket_Client.getInputStream () );
         OUT = new ObjectOutputStream ( socket_Client.getOutputStream () );

         // Required when  applications wish to decrease network latency and increase performance,
         socket_Client.setTcpNoDelay ( true );

         while (true)
         {
             System.out.print("Start\n");

             info = (GameInfo)(Serializable) IN.readObject();

             temp = info.data;

             System.out.print(temp + "\n");

             // Enables us to accept the data.
             callback.accept ( temp );

             System.out.print("end\n");
         }
        }

        catch (Exception e)
        {

        }
    }

    //  Now setting up to send the Data to the Server.

    public void Send_Data(String Server_data) {

        try {

            // Making a new call to the GameInfo object
            GameInfo data_transfer = new GameInfo ( );

            data_transfer.data = Server_data;

            OUT.writeObject( Server_data );

        } catch (IOException e) {
        }
    }
}
