package String_Practice_day01;

//public class LongestSubPalindrom {
//}


class Main { // Class definition begins

    // Method to find and print the longest palindromic substring in the given string
    public static void longestPalindrome(String str) {
        int n = str.length(); // Get the length of the string
        int max = 1, start = 0; // Initialize the maximum length of palindrome and the start index

        // Loop through each character of the string
        for (int i = 0; i < n; i++) {
            int low = i - 1;  // Initialize 'low' pointer to the character before the current character
            int high = i + 1; // Initialize 'high' pointer to the character after the current character

            // Expand around the center while characters on both sides are equal (checking for palindrome)
            while (low >= 0 && high < n && str.charAt(low) == str.charAt(high)) {
                low--;  // Move 'low' pointer one step left
                high++; // Move 'high' pointer one step right
            }

            // Check if the current palindrome is the longest found so far
            if (high - low - 1 > max) {
                start = low + 1;           // Update the start index of the palindrome
                max = high - low - 1;      // Update the maximum length of the palindrome
            }
        }

        // Print the longest palindromic substring
        System.out.println(str.substring(start, start + max));
    }

    // Main method to test the longestPalindrome method
    public static void main(String[] args) {
        String str = "mojologiccigolmojo"; // Example string containing a palindrome
        longestPalindrome(str); // Call the method to find and print the longest palindrome
    }
}
