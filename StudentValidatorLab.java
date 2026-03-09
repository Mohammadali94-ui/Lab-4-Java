import java.util.*;
import java.util.regex.*;

// Mohammad Ali Bokhari
// Lab 4 - Java Regex Validator

public class StudentValidatorLab {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // PART 1 — NAME VALIDATION
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();

        if (fullName.matches("[A-Za-z ]+")) {
            System.out.println("Valid name");
        } else {
            System.out.println("Invalid name");
        }

        // PART 2 — STUDENT ID VALIDATION
        System.out.print("Enter student ID (S-1234): ");
        String studentId = scanner.nextLine();

        if (studentId.matches("S-\\d{4}")) {
            System.out.println("Valid student ID");
        } else {
            System.out.println("Invalid student ID");
        }

        // PART 3 — EMAIL VALIDATION
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }

        // PART 4 — SENTENCE PROCESSING
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int vowelCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toLowerCase(sentence.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);

        String reversed = new StringBuilder(sentence).reverse().toString();
        System.out.println("Reversed sentence: " + reversed);

        String hiddenDigits = sentence.replaceAll("\\d", "*");
        System.out.println("Sentence with digits replaced: " + hiddenDigits);

        scanner.close();
    }
}