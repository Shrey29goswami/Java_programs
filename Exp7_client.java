import java.io.*;
import java.net.*;
import java.util.Scanner;


public class Exp7_Client{ //Exp7_Client.java
 public static void main(String[] args) throws IOException{
 try{
 Scanner scn = new Scanner(System.in);

 // getting localhost ip
 InetAddress ipaddress = InetAddress.getByName("localhost");

// establish the connection with server port 5006
 Socket s = new Socket(ipaddress, 5006);

// obtaining input and out streams
DataInputStream dis = new DataInputStream(s.getInputStream());
 DataOutputStream dos = new DataOutputStream(s.getOutputStream());

 dos.writeUTF(args[0]); //java Exp6_Client myfile.exe
// printing date or time as requested by client
 String filecontents = dis.readUTF();
 System.out.println(filecontents);

 // closing resources
 scn.close();
 dis.close();
 dos.close();
 }catch(Exception e){
 e.printStackTrace();
 }
 }
}
