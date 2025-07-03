import java.util.Scanner;
import java.lang.Math;

public class floatingplaces
{
      public static void main(String args[])
      {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter the first num:- ");
            double a = reader.nextDouble();
            System.out.println("Enter the second num:- ");
            double b = reader.nextDouble();
            reader.close();
            if(Math.abs(a-b) <= 0.001)
            {
                  System.out.println("Entered both numbers are same.");
            }
            else
            {
                  System.out.println("Entered both numbers are different. ");
            }
      }
}