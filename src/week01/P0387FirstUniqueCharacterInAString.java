package week01;

import java.util.HashMap;

// LC 387 First Unique Character in a String
// Pattern: Count, then scan
// Time O(n) Space O(1)
// Easy 6 Oct 2026
// Signal: "Pass 1: map frequencies. Pass 2: scan string left-to-right to find first count of 1."
// Solved: Solved

class P0387FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;
    }
}