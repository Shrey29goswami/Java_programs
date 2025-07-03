import java.util.Scanner;

public class leapyear
{
      public static void main(String args[])
      {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter the value of n :- ");
            int n = reader.nextInt();
            reader.close();

            
            
            int sum=0;
            int avg=0;
            for(int i=1;i<=n;i++)
            {
                  sum += i;
            }           
            System.out.println("Sum of " + n +" numbers is :- " + sum);
            avg = sum/n;
            System.out.println("Average of " + n +" numbers is :- " + avg);
                             
      }
}