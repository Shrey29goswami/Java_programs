//program to take input in java

import java.util.Scanner;
public class input_data
{
  public static void main(String args[])
  {
       System.out.print("Enter the number= ");
       Scanner reader = new Scanner(System.in);//object creation
       int num = reader.nextInt();
       System.out.print("\n Entered number is "+ num);
  }
}