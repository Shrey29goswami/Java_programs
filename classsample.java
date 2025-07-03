//
//
import java.util.*;  

public class Greeter {

  // Method to greet someone
  public void greet(String name, int id) {
    System.out.println("Hello, " + name + "!");
    System.out.println("id:- "+id);
  }

  // Main method (entry point of the program)
  public static void main(String[] args) {
    // Create a Greeter object
    Greeter greeter = new Greeter();
    
    //The Scanner class is used to get user input, and it is found in the java.util package
    Scanner sc= new Scanner(System.in);
    System.out.println("name:- ");
    String str= sc.nextLine();    
    System.out.println("id:- ");
    int id = sc.nextInt();
    
    // Call the greet method with a variable str
    greeter.greet(str,id);
    
  }
}
