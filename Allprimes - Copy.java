//program to find all the prime numbers in a given range
import java.util.Scanner;
import java.lang.Math;

public class AllPrimes {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number:- ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number:- ");
        int num2 = in.nextInt();
        in.close();

        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
