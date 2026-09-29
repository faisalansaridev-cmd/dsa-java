package week01;

// LC 1929 Concatenation of Array
// Pattern: Array construction
// Time O(n) Space O(n)
// Easy 29 Sep 2026
// Signal: "Output size is known up front (2n) and every output slot maps directly to an input index."
// Solved: with hint

class P1929ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }
}