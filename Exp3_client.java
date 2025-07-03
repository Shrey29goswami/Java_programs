import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Exp3_Client {
    public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException, ClassNotFoundException {
        InetAddress host = InetAddress.getLocalHost();
        Socket socket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        socket = new Socket(host.getHostName(), 5003);

        oos = new ObjectOutputStream(socket.getOutputStream());
        System.out.println("Sending request to Socket Server:");
        oos.writeObject("Hello");

        ois = new ObjectInputStream(socket.getInputStream());
        Object receivedObject = ois.readObject();

        if (receivedObject instanceof String) {
            String message = (String) receivedObject;
            System.out.println("Message from the server: " + message);
        } else {
            System.out.println("Unexpected object type received from the server");
        }

        ois.close();
        oos.close();
        Thread.sleep(100);
    }
}

