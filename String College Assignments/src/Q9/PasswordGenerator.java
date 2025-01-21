package Q9;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Take first name, middle name, last name, and roll number as input
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Enter your middle name (or leave it empty if not present): ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Enter your roll number: ");
        String rollNumber = scanner.nextLine().trim();

        // Generate the password
        String password = generatePassword(firstName, middleName, lastName, rollNumber);

        // Print the generated password
        if (password != null) {
            System.out.println("Generated Password: " + password);
        }
    }

    public static String generatePassword(String firstName, String middleName, String lastName, String rollNumber) {
        // Initialize a StringBuilder to construct the password
        StringBuilder password = new StringBuilder();

        // Add the first letter of the first name
        if (!firstName.isEmpty()) {
            password.append(firstName.charAt(0));
        }

        // Add the first letter of the middle name if it exists
        if (!middleName.isEmpty()) {
            password.append(middleName.charAt(0));
        }

        // Add the first letter of the last name
        if (!lastName.isEmpty()) {
            password.append(lastName.charAt(0));
        }

        // Extract and add the last four digits of the roll number
        if (rollNumber.length() >= 4) {
            password.append(rollNumber.substring(rollNumber.length() - 4));
        } else {
            System.out.println("Error: Roll number must have at least 4 digits.");
            return null; // Return null if roll number is invalid
        }

        // Convert the password to uppercase for a consistent format
        return password.toString().toUpperCase();
    }
}

