// LC 202 Happy Number
// Pattern: Fast/Slow Pointers (Floyd's Cycle Detection)
// Time O(log N) Space O(1)
// Easy 29 Oct 2026
// Signal: "Use a helper method getNext() to sum the square of digits. Use two pointers where slow takes one step and fast takes two steps (getNext(getNext(fast))). If they meet at 1, it is happy. If they meet at any other number, it is trapped in a cycle."

class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);

        while(fast != 1 && slow != fast){
            slow = getNext(slow);
            fast = getNext(getNext(fast)); 
        }

        return fast == 1;
    }

    public int getNext(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += (digit * digit);
            n /= 10;
        }
        return sum;
    }
}