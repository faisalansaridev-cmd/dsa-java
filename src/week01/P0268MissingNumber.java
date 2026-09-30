package week01;

// LC 268 Missing Number
// Pattern: Bit Manipulation / Write Math
// Time O(n) Space O(1)
// Easy 30 Sep 2026
// Signal: "XOR the expected indices and actual values; pairs cancel to 0 leaving only the missing number."
// Solved: with hint

class P0268MissingNumber {
    // XOR Bit Manipulation
    public int missingNumber(int[] nums) {
        int result = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            result = result ^ i ^ nums[i]; 
        }
        
        return result;
    }

    // Difference Math
    public int missingNumber2(int[] nums) {
        int result = nums.length; // Start with 'n'
        
        for (int i = 0; i < nums.length; i++) {
            result += (i - nums[i]); // Add expected index, subtract actual number
        }

        return result;
    }
}