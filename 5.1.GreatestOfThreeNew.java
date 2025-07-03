//program to find the greatest number among three numbers with anew method 
import java.util.Scanner;

public class greatest3_new
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

           int result = (num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3));
	   System.out.print("Greatest number among three numbers is "+ result);

           
     }
}
