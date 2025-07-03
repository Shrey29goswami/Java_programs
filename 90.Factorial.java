//program to find the factorial of a number
import java.util.Scanner;
import java.lang.Math;

public class factorial
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number n:-");
		int n = reader.nextInt();

	        int fact = 1;
	

		for(int i=1;i<=n;i++)
		{
			fact = fact*i;

		}
		System.out.println("factorial of "+n+" is "+fact);

	}
}
