// LC 290 Word Pattern
// Pattern: HashMap / Bijection
// Time O(N) Space O(N)
// Easy 27 Oct 2026
// Signal: "Split the string into an array and verify its length matches the pattern length. Use a HashMap to map characters to words, ensuring you check map.containsValue() before inserting to guarantee a strict 1-to-1 bijection."

import java.util.HashMap;

public class P0290WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s");

        if (words.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(words[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), words[i]);
            } else if (!map.get(pattern.charAt(i)).equals(words[i])) {
                return false;
            }
        }

        return true;
    }
}
