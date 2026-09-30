package week01;

import java.util.HashMap;

// LC 1 Two Sum
// Pattern: hash map
// Time O(n) Space O(n)
// Easy 30 Sep 2026
// Signal: "Check the map for (target - current) before inserting to complete in one pass."
// Solved: with hint

class P0001TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int search = 0;
        int[] result = { -1, -1 };

        for (int i = 0; i < nums.length; i++) {
            search = target - nums[i];
            if (map.containsKey(search) && map.get(search) != i) {
                result = new int[] { map.get(search), i };
                break;
            } else {
                map.put(nums[i], i);
            }
        }

        return result;
    }
}