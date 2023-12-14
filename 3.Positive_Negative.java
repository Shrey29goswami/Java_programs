import java.util.Scanner;

public class positive_negative
{
     public static void main(String args[])
     {
           Scanner reader = new Scanner(System.in);
           System.out.println("Enter the number:- ");
           int number = reader.nextInt();
           if( number > 0)
           {
                  System.out.println("Entered number " + number + " is a positive number.");      
           }
           else
           {
                  System.out.println("Entered number " + number + " is a negative number.");
           }



     }



}