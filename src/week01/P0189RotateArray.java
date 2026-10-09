package week01;

// LC 189 Rotate Array
// Pattern: Array Reversal
// Time O(n) Space O(1)
// Medium 9 Oct 2026
// Signal: "Reverse the entire array, then reverse first k, then reverse remaining n-k."
// Solved: Solved

class P0189RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}