package Q5;

import java.util.Scanner;

public class StringBufferExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a StringBuffer object
        System.out.print("Enter a string: ");
        StringBuffer buffer = new StringBuffer(scanner.nextLine());

        // 1. Display the original string
        System.out.println("Original string: " + buffer);

        // 2. Append a string
        System.out.print("Enter a string to append: ");
        String appendString = scanner.nextLine();
        buffer.append(appendString);
        System.out.println("After appending: " + buffer);

        // 3. Insert a string at a specific position
        System.out.print("Enter a string to insert: ");
        String insertString = scanner.nextLine();
        System.out.print("Enter the position to insert at (0-based index): ");
        int position = scanner.nextInt();
        buffer.insert(position, insertString);
        System.out.println("After inserting: " + buffer);

        // 4. Reverse the string
        buffer.reverse();
        System.out.println("After reversing: " + buffer);

        // 5. Delete a portion of the string
        buffer.reverse(); // Reverse back to the original order
        System.out.print("Enter the start index to delete: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the end index to delete: ");
        int endIndex = scanner.nextInt();
        buffer.delete(startIndex, endIndex);
        System.out.println("After deleting: " + buffer);
    }
}

