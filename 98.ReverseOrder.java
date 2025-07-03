// program to print the digits of a number in reverse order
import java.util.Scanner;

public class reverseorder{
          public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number:- ");
		int num = in.nextInt();
		int numcopy = num;
		int reverse = 0;
		while(num>0){
		reverse= reverse*10 + num%10;
                num=num/10;
		//System.out.println(" ");
		}
		System.out.print("reverse order is:-"+reverse);
	}
}
