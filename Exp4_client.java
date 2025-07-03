import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Exp3_Client {
    public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException, ClassNotFoundException {
        InetAddress host = InetAddress.getLocalHost();
        Socket socket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        Scanner sc = new Scanner(System.in);

        for (;;) {
            // Establish socket connection to server
            socket = new Socket(host.getHostName(), 5004);

            // Write to socket using ObjectOutputStream
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            String msg = sc.nextLine();

            if (msg.equalsIgnoreCase("bye")) {
                oos.writeObject("bye");
          

