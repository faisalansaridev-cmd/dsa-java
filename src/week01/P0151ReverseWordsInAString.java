package week01;

// LC 151 Reverse Words in a String
// Pattern: String parsing
// Time O(n) Space O(n)
// Medium 12 Oct 2026
// Signal: "Words separated by arbitrary spaces; output needs single spaces and no padding."
// Solved: with solution

class P0151ReverseWordsInAString {
    public String reverseWords(String s) {
        // Playbook Target: Use regex split and StringBuilder
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}