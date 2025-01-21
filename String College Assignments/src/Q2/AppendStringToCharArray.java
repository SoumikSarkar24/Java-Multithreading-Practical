package Q2;
import java.util.Scanner;

public class AppendStringToCharArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Character array of length 5
        char[] charArray = new char[5];
        System.out.println("Enter 5 characters for the char array:");
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = scanner.next().charAt(0);
        }

        // Input: String from the keyboard
        System.out.print("Enter a string: ");
        scanner.nextLine(); // Consume the leftover newline
        String inputString = scanner.nextLine();

        // Convert char array to a string and append the input string
        String charArrayAsString = new String(charArray);
        String result = charArrayAsString + inputString;

        // Print the result
        System.out.println("Resulting string: " + result);
    }
}

