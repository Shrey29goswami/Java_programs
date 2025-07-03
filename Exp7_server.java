import java.io.*;
import java.net.*;
import java.util.Scanner;
// Server class
public class Exp7_Server{
public static void main(String[] args) throws IOException{
// server is listening on port 5006
 ServerSocket ss = new ServerSocket(5006);

// running infinite loop for getting client request
 while(true){
 Socket s = null;
 try{
// create socket object to communicate with client
 s = ss.accept();
 System.out.println("A new client is connected : " +s);
// obtaining input and out streams
 DataInputStream dis = new DataInputStream(s.getInputStream());
 DataOutputStream dos = new DataOutputStream(s.getOutputStream());
 System.out.println("Assigning new thread for this client");

// create a new thread object
 Thread t = new ClientHandler(s, dis, dos); //returns an instance of Thread class

// Invoking the start() method
 t.start(); //calls run method of Thread class
 }catch (Exception e){
 s.close();
 e.printStackTrace(); }
 } //end of while(true)
 } //end of main()
}
// ClientHandler class
class ClientHandler extends Thread{
 final DataInputStream dis;
 final DataOutputStream dos;
 final Socket s;


public ClientHandler(Socket s, DataInputStream dis,
DataOutputStream dos)
 {
 this.s = s;
 this.dis = dis;
 this.dos = dos;
 }
 public void run()
 {
 String filename;

 while(true){
 try{
// receive the answer from client
 filename = dis.readUTF();
 System.out.println("Received File name is "+filename);
//create an object of File class
 File f = new File(filename);
//map object of file class to scanner class object
 Scanner sc = new Scanner(f);
 String filecontents="";
 while(sc.hasNextLine()) { //return true or false
 filecontents += sc.nextLine();
filecontents += "\n";
}
// write contents of a requested file to the socket
dos.writeUTF(filecontents);
 } catch (IOException e) {e.printStackTrace(); }
 try{
// closing resources allocated for each client
 this.dis.close();
 this.dos.close();
 }catch(IOException e){e.printStackTrace();}
} //end of while
 } //end of run()
 }
