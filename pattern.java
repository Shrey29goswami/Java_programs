//program to make numerical pattern in java
import java.util.Scanner;
import java.lang.Math;

public class numerical_pattern
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print( j +" ");
			}
			System.out.print("\n");
		}
	


	}


}
