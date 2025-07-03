import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.File;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Exp5_Server {
    private static DataOutputStream dataOutputStream = null;
    private static DataInputStream dataInputStream = null;
    public static void main(String[] args) {

        try(ServerSocket serverSocket = new ServerSocket(5000)){
            System.out.println("listening to port:5000");
            Socket clientSocket = serverSocket.accept();
            System.out.println(clientSocket+" connected.");
            dataInputStream = new DataInputStream(clientSocket.getInputStream());
            dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
            String filename = dataInputStream.readUTF();
            System.out.println("File name is "+filename);
            File f=new File(filename);
            Scanner sc = new Scanner(f);
            String msg="";
            while (sc.hasNextLine()){
                 msg += sc.nextLine();
                 msg+="\n";
            }
            dataOutputStream.writeUTF(msg);

            dataInputStream.close();
            dataOutputStream.close();
            clientSocket.close();
      }
      catch (Exception e){
          e.printStackTrace();
      }
   }
}
