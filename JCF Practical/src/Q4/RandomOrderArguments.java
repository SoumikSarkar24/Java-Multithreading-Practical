package Q4;

import java.util.Random;

public class RandomOrderArguments {
    public static void main(String[] args) {
        // Get the number of arguments
        int n = args.length;

        // Create a Random object
        Random random = new Random();

        // Shuffle the array using Fisher-Yates algorithm
        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1); // Generate a random index
            // Swap args[i] with args[j]
            String temp = args[i];
            args[i] = args[j];
            args[j] = temp;
        }

        // Print the arguments in random order using enhanced for loop
        System.out.println("Arguments in random order:");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}

