package Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListSort {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a list to store the numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Take input for each element and add to the list
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Sort the list in ascending order
        Collections.sort(numbers);

        // Display the sorted list
        System.out.println("The sorted list is: " + numbers);

        // Close the scanner
        scanner.close();
    }
}

