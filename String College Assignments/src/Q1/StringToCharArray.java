package Q1;

import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string into a character array
        char[] charArray = inputString.toCharArray();

        // Print the character array
        System.out.print("Character array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}

