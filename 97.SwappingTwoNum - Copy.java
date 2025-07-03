//program to swap two numbers using a third variable

import java.util.Scanner;
import java.lang.Math;

public class swapping
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the value of 'a':- ");
		int a = reader.nextInt();
		System.out.print("Enter the value of 'b':- ");
		int b= reader.nextInt();

		int temp = a;
		a = b;
		b= temp;

	        System.out.print("Value of 'a' after swap :- "+a);
		System.out.print("Value of 'b' after swap:- "+temp);


		//return 0;



	}
}
