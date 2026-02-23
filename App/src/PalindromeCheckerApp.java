public class PalindromeCheckerCharArray {

    // Use Case 4: Check if a character array is a palindrome
    // Main method: Two-pointer approach on character array
    public static boolean isPalindromeCharArray(char[] chars) {
        if (chars == null || chars.length == 0) {
            return true;
        }

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Variant 1: Case insensitive character array palindrome
    public static boolean isPalindromeCharArrayCaseInsensitive(char[] chars) {
        if (chars == null || chars.length == 0) {
            return true;
        }

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (Character.toLowerCase(chars[left]) != Character.toLowerCase(chars[right])) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Variant 2: Ignore spaces and special characters in character array
    public static boolean isPalindromeCharArrayIgnoreNonAlphanumeric(char[] chars) {
        if (chars == null || chars.length == 0) {
            return true;
        }

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Skip non-alphanumeric characters from left
            while (left < right && !Character.isLetterOrDigit(chars[left])) {
                left++;
            }

            // Skip non-alphanumeric characters from right
            while (left < right && !Character.isLetterOrDigit(chars[right])) {
                right--;
            }

            // Compare after converting to lowercase
            if (Character.toLowerCase(chars[left]) != Character.toLowerCase(chars[right])) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Variant 3: Convert string to char array and check palindrome
    public static boolean isPalindromeFromString(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }

        // Convert string to character array
        char[] chars = input.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (Character.toLowerCase(chars[left]) != Character.toLowerCase(chars[right])) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Variant 4: Reverse character array and compare
    public static boolean isPalindromeCharArrayReverse(char[] chars) {
        if (chars == null || chars.length == 0) {
            return true;
        }

        // Create reversed array
        char[] reversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversed[i] = chars[chars.length - 1 - i];
        }

        // Compare arrays
        return java.util.Arrays.equals(chars, reversed);
    }

    // Variant 5: Reverse character array in-place (modifies original)
    public static boolean isPalindromeCharArrayReverseInPlace(char[] chars) {
        if (chars == null || chars.length == 0) {
            return true;
        }

        // Create a copy to avoid modifying original
        char[] copy = chars.clone();

        int left = 0;
        int right = copy.length - 1;

        // Reverse the array in-place
        while (left < right) {
            char temp = copy[left];
            copy[left] = copy[right];
            copy[right] = temp;
            left++;
            right--;
        }

        // Compare with original
        return java.util.Arrays.equals(chars, copy);
    }

    // Variant 6: Check palindrome with digit array
    public static boolean isPalindromeDigitArray(int[] digits) {
        if (digits == null || digits.length == 0) {
            return true;
        }

        int left = 0;
        int right = digits.length - 1;

        while (left < right) {
            if (digits[left] != digits[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Helper method: Convert string to char array
    public static char[] stringToCharArray(String str) {
        if (str == null) {
            return new char[0];
        }
        return str.toCharArray();
    }

    // Helper method: Print character array
    public static void printCharArray(char[] chars) {
        System.out.print("[");
        for (int i = 0; i < chars.length; i++) {
            System.out.print("'" + chars[i] + "'");
            if (i < chars.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}