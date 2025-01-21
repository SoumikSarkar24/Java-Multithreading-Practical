package Q14;

public class DeleteCharacter {
    public static void main(String[] args) {
        // Example input string and m value
        String inputString = "HelloWorld";
        int m = 4; // Index of the character to be removed (0-based index)

        // Call the deleteMe method
        String result = deleteMe(inputString, m);

        // Print the result
        System.out.println("String after deletion: " + result);
    }

    public static String deleteMe(String str, int m) {
        // Check if the m is a valid index
        if (m < 0 || m >= str.length()) {
            System.out.println("Invalid index.");
            return str; // Return the original string if the index is invalid
        }

        // Remove the mth character from the string
        String modifiedString = str.substring(0, m) + str.substring(m + 1);
        return modifiedString;
    }
}

