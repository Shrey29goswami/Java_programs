import java.util.Scanner;
import java.lang.Math;

public class multiplication_table
{
      public static void main(String args[])
      {
            Scanner reader= new Scanner(System.in);
            System.out.println("Enter an integer n:- ");
            int n=reader.nextInt();
            reader.close();

            for(int i=1;i<=10;i++)
            {
                  int product=1;
                  product = n*i;
                  System.out.println(n + " x "+ i + " = " + product );
            }
            System.out.println();
      }
}