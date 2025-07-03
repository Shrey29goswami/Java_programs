import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        final String SERVER_ADDRESS = "localhost";
        final int PORT = 5009;

        try (Socket socket = new Socket(SERVER_ADDRESS, PORT);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {

            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                System.out.println("Server: " + in.readLine());
                if ("bye".equalsIgnoreCase(userInput)) {
                    break;
                }
            }
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + SERVER_ADDRESS);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Error connecting to server: " + e.getMessage());
            System.exit(1);
        }
    }
}
