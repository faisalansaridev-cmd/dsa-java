// LC 20 Valid Parentheses
// Pattern: Stack / ArrayDeque
// Time O(n) Space O(n)
// Easy 22 Oct 2026
// Signal: "Use ArrayDeque for stacks. Extract pop() to a variable before comparing. Return stack.isEmpty() at the end to catch leftover brackets."

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false; // Catch lone closing brackets
                
                char top = stack.pop();
                if ((top == '(' && ch != ')') || 
                    (top == '{' && ch != '}') || 
                    (top == '[' && ch != ']')) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // Catch lone opening brackets
    }
}