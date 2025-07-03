//Program to check the given charater is alphabet or not
//
import java.util.Scanner;
import java.lang.Math;

public class Alphabetchar
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("\n Enter a char:-");
		char ch = in.next().charAt(0);
		if((ch >= 'a' && ch <= 'Z') || (ch >= 'A' && ch <= 'Z'))
		{
		      System.out.print("\nEntred character is an Alphabet.");
		}
		else{
			System.out.print("\nEntred character is not an Alphabet.");
		}
	}
}
