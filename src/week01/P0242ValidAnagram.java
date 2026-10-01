package week01;

// LC 242 Valid Anagram
// Pattern: Counting, int[26]
// Time O(n) Space O(1)
// Easy 1 Oct 2026
// Signal: "Use int[26] as a frequency map. +1 for s, -1 for t. Return false early if count drops below 0."
// Solved: watched solution

class P0242ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int freq = s.charAt(i) - 'a';
            count[freq] += 1;
        }

        for (int i = 0; i < t.length(); i++) {
            int freq = t.charAt(i) - 'a';
            count[freq] -= 1;

            if (count[freq] < 0) {
                return false;
            }
        }

        return true;
    }
}