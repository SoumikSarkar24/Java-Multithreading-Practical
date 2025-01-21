package Q12;

import java.util.Scanner;

public class FirstHalfOfString {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get the first half of the string or null if the length is odd
        String result = getFirstHalf(input);

        // Print the result
        if (result != null) {
            System.out.println("First half of the string: " + result);
        } else {
            System.out.println("The string length is odd, returning null.");
        }
    }

    public static String getFirstHalf(String str) {
        // Check if the string length is odd
        if (str.length() % 2 != 0) {
            return null; // Return null for odd length
        }

        // Return the first half of the string
        return str.substring(0, str.length() / 2);
    }
}

