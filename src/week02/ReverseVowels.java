// LC 345 Reverse Vowels of a String
// Pattern: Two Pointers (Outside-In)
// Time O(n) Space O(n)
// Easy 22 Oct 2026
// Signal: "Use a flat if/else if/else structure inside the main while loop to prevent index out of bounds and pointer skipping."
// Solved: with hint

class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int left = 0;
        int right = word.length - 1;

        while (left < right) {
            char lower_1 = Character.toLowerCase(word[left]);
            char lower_2 = Character.toLowerCase(word[right]);

            boolean leftIsVowel = (lower_1 == 'a' || lower_1 == 'e' || lower_1 == 'i' || lower_1 == 'o' || lower_1 == 'u');
            boolean rightIsVowel = (lower_2 == 'a' || lower_2 == 'e' || lower_2 == 'i' || lower_2 == 'o' || lower_2 == 'u');

            if (leftIsVowel) {
                if (rightIsVowel) {
                    char temp = word[left];
                    word[left] = word[right];
                    word[right] = temp;
                    left++;
                    right--;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        return new String(word);
    }
}