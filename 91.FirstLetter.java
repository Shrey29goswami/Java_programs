import java.util.Scanner;

public class LexicographicalComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.println("Enter the first string (A):");
        String A = scanner.next();

        System.out.println("Enter the second string (B):");
        String B = scanner.next();

        // Compare strings lexicographically
        int comparisonResult = A.compareTo(B);

        if (comparisonResult > 0) {
            System.out.println("A is lexicographically larger than B");
        } else if (comparisonResult < 0) {
            System.out.println("B is lexicographically larger than A");
        } else {
            System.out.println("Both strings are lexicographically equal");
        }

        scanner.close();
    }
}
