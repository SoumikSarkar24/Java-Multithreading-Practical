package Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSum {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a list to store the numbers
        ArrayList<Double> numbers = new ArrayList<>();

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Take input for each element and add to the list
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            double num = scanner.nextDouble();
            numbers.add(num);
        }

        // Calculate the sum of the elements
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        // Display the list and its sum
        System.out.println("The list of numbers is: " + numbers);
        System.out.println("The sum of the elements is: " + sum);

        // Close the scanner
        scanner.close();
    }
}

