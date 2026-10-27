// LC 128 Longest Consecutive Sequence
// Pattern: HashSet / O(1) Lookups
// Time O(N) Space O(N)
// Medium 27 Oct 2026
// Signal: "Use a HashSet to store all numbers. To strictly achieve O(N) time, only begin counting a sequence if the current number is the absolute start (!set.contains(num - 1)). Use a while loop to count upward and track the maximum length."

import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }
        
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        
        int max_count = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int count = 1;
                int currentNum = num;
                
                while (set.contains(currentNum + 1)) {
                    count++;
                    currentNum++;
                }
                
                max_count = Math.max(max_count, count);
            }
        }
        return max_count;
    }
}