package week01;

// LC 125 Valid Palindrome
// Pattern: Two Pointers (Inward)
// Time O(n) Space O(1)
// Easy 8 Oct 2026
// Signal: "Skip non-alphanumeric characters, then compare left and right inward."
// Solved: Solved

class P0125ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}