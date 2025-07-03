import java.util.Scanner;

public class Weekday
{
      public static void main(String args[])
      {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter the num:- ");
            int num = reader.nextInt();
            int rem = num % 7;
            if(rem == 0)
            {
                  System.out.println("It is Sunday.");
            }
            else if(rem == 1)
            {
                  System.out.println("It is Monday.");
            }
            else if(rem == 2)
            {
                  System.out.println("It is Tuesday.");
            }
            else if(rem == 3)
            {
                  System.out.println("It is Wednesday.");
            }
            else if(rem == 4)
            {
                  System.out.println("It is Thursday.");
            }
            else if(rem == 5)
            {
                  System.out.println("It is Friday.");
            }
            else if(rem == 6)
            {
                  System.out.println("It is Saturday.");
            }
      }
}