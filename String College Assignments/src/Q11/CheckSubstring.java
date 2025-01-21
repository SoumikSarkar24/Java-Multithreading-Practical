package Q11;

public class CheckSubstring {
    public static void main(String[] args) {
        // The main string
        String mainString = "University of Technology";

        // The substring to check
        String substring = "Tech";

        // Find the position of the substring
        int position = mainString.indexOf(substring);

        if (position != -1) {
            System.out.println("\"" + substring + "\" is present in \"" + mainString + "\" at position: " + position);
        } else {
            System.out.println("\"" + substring + "\" is not present in \"" + mainString + "\".");
        }
    }
}

