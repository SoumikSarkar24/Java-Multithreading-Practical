package Q7;

public class StringConcatenation {
    public static void main(String[] args) {
        // Test the method with two example strings
        String str1 = "Mark";
        String str2 = "Kate";

        String result = concatenateStrings(str1, str2);

        // Output the result
        System.out.println("Result: " + result);
    }

    public static String concatenateStrings(String str1, String str2) {
        // Convert both strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if the last character of str1 is the same as the first character of str2
        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            // Concatenate, skipping the first character of str2
            return str1 + str2.substring(1);
        } else {
            // No duplication, just concatenate the strings
            return str1 + str2;
        }
    }
}

