import java.util.Scanner;

public class leapyear
{
      public static void main(String args[])
      {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter the value of n :- ");
            int n = reader.nextInt();
            reader.close();

            System.out.println("First " + n +" natural numbers are :- ");
            for(int i=1;i<=n;i++)
            {
                  System.out.println( i +" ");
            }           
                             
      }
}