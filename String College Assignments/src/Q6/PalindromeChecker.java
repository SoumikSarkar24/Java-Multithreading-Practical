package Q6;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }

    // Method to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lower case to handle case-insensitive palindrome check
        String cleanedString = str.replaceAll("\\s+", "").toLowerCase();

        // Reverse the cleaned string
        String reversedString = new StringBuilder(cleanedString).reverse().toString();

        // Compare the cleaned string with its reversed version
        return cleanedString.equals(reversedString);
    }
}

