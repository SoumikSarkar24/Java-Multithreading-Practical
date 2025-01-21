package Q10;

import java.util.Scanner;

public class StringMerger {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for s1 and s2
        System.out.print("Enter the first string (s1): ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string (s2): ");
        String s2 = scanner.nextLine();

        // Generate the merged string s3
        String s3 = mergeStrings(s1, s2);

        // Print the result
        System.out.println("Merged String (s3): " + s3);
    }

    public static String mergeStrings(String s1, String s2) {
        StringBuilder s3 = new StringBuilder();

        // Get the lengths of s1 and s2
        int len1 = s1.length();
        int len2 = s2.length();

        // Alternate characters from s1 and s2
        int minLength = Math.min(len1, len2);
        for (int i = 0; i < minLength; i++) {
            s3.append(s1.charAt(i)); // Add character from s1
            s3.append(s2.charAt(i)); // Add character from s2
        }

        // Append remaining characters from the longer string
        if (len1 > len2) {
            s3.append(s1.substring(minLength)); // Add remaining from s1
        } else if (len2 > len1) {
            s3.append(s2.substring(minLength)); // Add remaining from s2
        }

        return s3.toString();
    }
}

