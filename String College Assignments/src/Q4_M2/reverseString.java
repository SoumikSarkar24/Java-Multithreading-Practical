package Q4_M2;

import java.util.Scanner;
class reverseString{
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        String reversed = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed += charArray[i];
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String ans = reverseString(str);
        System.out.println(ans);
    }
}

