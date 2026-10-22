// LC 205 Isomorphic Strings
// Pattern: Two-way Mapping / HashMap
// Time O(n) Space O(1)
// Easy 22 Oct 2026
// Signal: "Check containsValue before inserting a new key to prevent two different keys from mapping to the exact same value."
// Solved: with hint

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        char[] ch_s = s.toCharArray();
        char[] ch_t = t.toCharArray();

        if (ch_s.length != ch_t.length) {
            return false;
        }

        for (int i = 0; i < ch_t.length; i++) {
            if (!map.containsKey(ch_s[i])) {
                // Key is new. Is the value already taken?
                if (map.containsValue(ch_t[i])) {
                    return false;
                }
                map.put(ch_s[i], ch_t[i]);
            } else {
                // Key exists. Does it map to the correct value?
                if (map.get(ch_s[i]) != ch_t[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}