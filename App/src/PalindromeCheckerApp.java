public class PalindromeChecker {

    // Use Case 1: Check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        // Remove spaces and convert to lowercase
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        // Compare string with its reverse
        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}