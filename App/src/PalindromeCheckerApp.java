public class PalindromeCheckerStringReverse {

    // Use Case 3: Check if a string is a palindrome using String Reverse method
    // This is the most straightforward approach using StringBuilder.reverse()
    public static boolean isPalindromeUsingReverse(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }

        // Remove spaces and special characters, convert to lowercase
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Compare original with reversed
        return cleaned.equals(reversed);
    }

    // Variant 1: Simple reverse without removing special characters
    public static boolean isPalindromeSimpleReverse(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }

        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Variant 2: Reverse with case insensitivity only
    public static boolean isPalindromeReverseCaseInsensitive(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }

        String cleaned = input.toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // Variant 3: Reverse with spaces ignored but keeping other characters
    public static boolean isPalindromeReverseIgnoreSpaces(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}