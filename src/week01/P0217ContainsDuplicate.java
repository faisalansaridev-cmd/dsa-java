package week01;

// LC 217 Contains Duplicate
// Pattern: hash set membership
// Time O(n) Space O(n)
// Easy =29 Sep 2026
// Signal: "does any value appear twice?"
// Solved: alone / hint

public class P0217ContainsDuplicate {
     public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }
}