import java.util.Scanner;
import java.lang.Math;

public class leapyear
{
      public static void main(String args[])
      {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter the year:- ");
            int year = reader.nextInt();
            reader.close();
            
            if(year % 4 == 0)
            {
                  System.out.println("Entered year is leap year.");
            }
            else
            {
                  System.out.println("Entered year is not a leap year.");
            }                  
      }
}