// program to check the number is positive or negative with different method
import java.util.Scanner;

public class positive_new
{
     public static void main(String args[])
     {
           Scanner reader = new Scanner(System.in);
           System.out.println("Enter the number:- ");
           int number = reader.nextInt();
           String result = number >0 ? "Positive number" : "Negative number";
           System.out.print("Entered number is "+result);
          
     }



}
