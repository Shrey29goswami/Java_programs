// Program to find the area of a circle
import java.util.Scanner;
import java.lang.Math;

public class areaofcircle
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius :- ");
		double radius = in.nextInt();
		in.close();

		double area = 2 * 3.14 * radius;
		System.out.println("Area of circle " + area);
	}
}
