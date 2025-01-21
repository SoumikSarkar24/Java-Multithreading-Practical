package Q4_M1;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take a string input from the keyboard
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Reverse the string
        String reversedString = reverseString(inputString);

        // Output the reversed string
        System.out.println("Reversed string: " + reversedString);
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}

