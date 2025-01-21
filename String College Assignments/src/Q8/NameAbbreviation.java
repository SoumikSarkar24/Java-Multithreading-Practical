package Q8;

import java.util.Scanner;

public class NameAbbreviation {
    public static void main(String[] args) {
        // Take input name from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        // Split the name by spaces to extract individual parts
        String[] nameParts = fullName.split(" ");

        // Initialize a StringBuilder to build the abbreviated name
        StringBuilder abbreviatedName = new StringBuilder();

        // Loop through all parts except the last one (for abbreviation)
        for (int i = 0; i < nameParts.length - 1; i++) {
            // Take the first letter of each part, convert to uppercase and add a dot
            abbreviatedName.append(nameParts[i].charAt(0)).append(".");
        }

        // Add the last part (full last name) without abbreviation
        abbreviatedName.append(nameParts[nameParts.length - 1]);

        // Print the abbreviated name in the desired format
        System.out.println("Abbreviated Name: " + abbreviatedName.toString());
    }
}

