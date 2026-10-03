package week01;

// LC 169 Majority Element
// Pattern: Counting -> Boyer-Moore
// Time O(n) Space O(1)
// Easy 3 Oct 2026
// Signal: "Boyer-Moore: If count == 0, pick new candidate. If match, count++. If mismatch, count--."
// Solved: with hint

class P0169MajorityElement {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}