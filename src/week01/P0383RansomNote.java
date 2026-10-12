package week01;

// LC 383 Ransom Note
// Pattern: Counting supply/demand
// Time O(m+n) Space O(1)
// Easy 12 Oct 2026
// Signal: "Can A be built from B's letters, each used once? - supply vs demand."
// Solved: with hint

class P0383RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Playbook Target: int[26] is faster and cleaner than HashMap for lowercase letters
        int[] supply = new int[26];
        
        for (int i = 0; i < magazine.length(); i++) {
            supply[magazine.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            int charIndex = ransomNote.charAt(i) - 'a';
            supply[charIndex]--;
            if (supply[charIndex] < 0) {
                return false;
            }
        }
        
        return true;
    }
}