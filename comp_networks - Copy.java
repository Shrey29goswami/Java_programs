import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;
public class Exp3_Server
{
//static ServerSocket variable
      private static ServerSocket server;

//socket server port on which it will listen
      private static int port = 5003;
      public static void main(String args[]) throws IOException, ClassNotFoundException{

 //create the socket server object
      server = new ServerSocket(port);

//keep listens indefinitely until receives 'exit' call or program terminates
      System.out.println("Waiting for the client request");

//creating socket and waiting for client connection
      Socket sock = server.accept();

//read from socket to ObjectInputStream object
      ObjectInputStream ois = new ObjectInputStream(sock.getInputStream());

//convert ObjectInputStream object to String
      String message = (String) ois.readObject();
      System.out.println("Message from the client: " + message);

 //create ObjectOutputStream object
      ObjectOutputStream oos = new ObjectOutputStream(sock.getOutputStream());

//write object to Socket
      oos.writeObject("Hello");

 //close resources
      ois.close();
      oos.close();
      sock.close();
      System.out.println("Shutting down Socket server!!");

//close the ServerSocket object
      server.close();
 }
}