public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("      Palindrome Checker App");
        System.out.println("      Version: 1.0");
        System.out.println("=================================\n");

        // UC2
        hardcodedPalindromeCheck();

        // UC3
        stringReversePalindromeCheck();
    }

    // ==========================
    // UC2: Hardcoded Palindrome
    // ==========================
    public static void hardcodedPalindromeCheck() {
        String word = "madam";
        if (word.equals("madam")) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }
    }

    // ==========================
    // UC3: String Reverse Palindrome
    // ==========================
    public static void stringReversePalindromeCheck() {
        String original = "racecar";
        String reversed = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is NOT a palindrome.");
        }
    }
}