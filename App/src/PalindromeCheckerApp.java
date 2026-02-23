public class PalindromeCheckerAdvanced {

    // Use Case 2: Check if a string is a palindrome
    // Ignores special characters, spaces, and case (e.g., "A man, a plan, a canal: Panama")
    public static boolean isPalindromeAdvanced(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }

        // Remove all non-alphanumeric characters and convert to lowercase
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // If empty or single character, it's a palindrome
        if (cleaned.length() <= 1) {
            return true;
        }

        // Use two-pointer approach for efficient checking
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}