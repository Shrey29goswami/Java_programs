import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;
public class Exp3_Server
{


 private static ServerSocket server;

 private static int port = 5003;
public static void main(String args[]) throws IOException, ClassNotFoundException{
 
 server = new ServerSocket(port);

System.out.println("Waiting for the client request");

 Socket socket = server.accept();

ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

 String message = (String) ois.readObject();
System.out.println("Message from the client: " + message);

ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

oos.writeObject("Hello");
 
ois.close();
oos.close();
socket.close();
System.out.println("Shutting down Socket server!!");

server.close();
 }
}