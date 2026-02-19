public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("      Palindrome Checker App");
        System.out.println("      Version: 1.0");
        System.out.println("=================================\n");

        // UC2 call
        hardcodedPalindromeCheck();
    }

    public static void hardcodedPalindromeCheck() {
        String word = "madam";
        if (word.equals("madam")) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }
    }
}