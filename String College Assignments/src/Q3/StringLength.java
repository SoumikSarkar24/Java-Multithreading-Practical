package Q3;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take a string from the keyboard
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the length of the original string
        int originalLength = inputString.length();

        // Trim the string to remove front and end spaces
        String trimmedString = inputString.trim();

        // Find the length of the trimmed string
        int trimmedLength = trimmedString.length();

        // Output the results
        System.out.println("Original length (including spaces): " + originalLength);
        System.out.println("Length excluding front and end spaces: " + trimmedLength);
    }
}

