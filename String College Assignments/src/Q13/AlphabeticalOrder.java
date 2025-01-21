package Q13;

import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get the string in alphabetical order
        String result = sortStringAlphabetically(input);

        // Print the sorted string
        System.out.println("String in alphabetical order: " + result);
    }

    public static String sortStringAlphabetically(String str) {
        // Convert string to character array
        char[] charArray = str.toCharArray();

        // Sort the character array
        java.util.Arrays.sort(charArray);

        // Convert the sorted character array back to a string
        return new String(charArray);
    }
}

