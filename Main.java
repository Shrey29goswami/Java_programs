// Custom exception subclass for representing an invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            int age = 23;
            validateAge(age);
            System.out.println("Age validation successful.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // A method that validates age and throws an InvalidAgeException if it's not fresher
    public static void validateAge(int age) throws InvalidAgeException {
        if (age > 24 || age < 21) {
            throw new InvalidAgeException("You are not a fresher.");
        }
        System.out.println("Valid age: " + age);
    }
}

