// LC 28 Find the Index of the First Occurrence in a String
// Pattern: String Traversal / Boolean Flag
// Time O(n*m) Space O(1)
// Easy 22 Oct 2026
// Signal: "Bound the outer loop to haystack.length() - needle.length(). Use a boolean flag to track if the inner loop broke early."
// Solved: with hint

class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                boolean isMatch = true;
                int seq = i;
                
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(seq) == needle.charAt(j)) {
                        seq++;
                    } else {
                        isMatch = false;
                        break;
                    }
                }
                
                if (isMatch) {
                    return i;
                }
            }
        }
        return -1;
    }
}