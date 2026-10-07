package week01;

// LC 238 Product of Array Except Self
// Pattern: Prefix x suffix
// Time O(n) Space O(1)
// Medium 6 Oct 2026
// Signal: "Build left prefix directly in output array, then multiply right suffix backwards."
// Solved: Solved

class P0238ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        int leftRunning = 1;
        int rightRunning = 1;
        
        for (int i = 0; i < n; i++) {
            answer[i] = leftRunning;
            leftRunning = leftRunning * nums[i];
        }
        
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightRunning;
            rightRunning = rightRunning * nums[i];
        }
        
        return answer;
    }
}