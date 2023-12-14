import java.util.Scanner;

public class greatest_of_three
{
     public static void main(String args[])
     {
           Scanner reader = new Scanner(System.in);
           System.out.println("Enter first number:- ");
           int num1 = reader.nextInt();
           System.out.println("Enter second number:- ");
           int num2 = reader.nextInt();
           System.out.println("Enter third number:- ");
           int num3 = reader.nextInt();

           if(num1 > num2 && num1 > num3)
           {
                 System.out.println("Entered first number " + num1 + " is greatest of all three numbers.");
           }
           else if(num2 > num1 && num2 > num3)
           {
                 System.out.println("Entered second number " + num2 + " is greatest of all three numbers.");
           }
           else
           {
                 System.out.println("Entered third number " + num3 + " is greatest of all three numbers.");
           }

           
     }
}