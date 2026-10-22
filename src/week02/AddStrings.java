// LC 415 Add Strings
// Pattern: Right-to-Left Math / Two Pointers
// Time O(max(N, M)) Space O(max(N, M))
// Easy 22 Oct 2026
// Signal: "Use charAt(p) - '0' for ASCII math. Extract digits with sum % 10 and carry with sum / 10."
// Solved: with hint

class Solution {
    public String addStrings(String num1, String num2) {
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (p1 >= 0 || p2 >= 0 || carry > 0) {
            int firstNum = (p1 >= 0) ? num1.charAt(p1) - '0' : 0;
            int secondNum = (p2 >= 0) ? num2.charAt(p2) - '0' : 0;

            int sum = firstNum + secondNum + carry;
            sb.append(sum % 10);
            carry = sum / 10;
            
            p1--;
            p2--;
        }
        
        sb.reverse();
        return sb.toString();
    }
}