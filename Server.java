import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        final int PORT = 5009;

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started. Listening on port " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket);

                ClientHandler clientHandler = new ClientHandler(clientSocket);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientHandler implements Runnable {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
        try {
            this.out = new PrintWriter(socket.getOutputStream(), true);
            this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Received from client: " + inputLine);
                out.println("Message received: " + inputLine);
                if ("bye".equalsIgnoreCase(inputLine)) {
                    break;
                }
            }
            System.out.println("Client disconnected: " + clientSocket);
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
