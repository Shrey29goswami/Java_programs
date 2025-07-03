//program to find that a string is palindrome or not.
import java.util.Scanner;
import java.lang.Math;

public class palindrome
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		int num = in.nextInt();
		int num1 = num;

		int reverse = 0;
		while(num>0){
			reverse = reverse*10 + num % 10;
			num = num/10;
		}
		if(reverse == num1)
		{
			System.out.print("Entered number is palindrome.");
		}else{
			System.out.print("Entered number is not palindrome.");
		}
	}
}
