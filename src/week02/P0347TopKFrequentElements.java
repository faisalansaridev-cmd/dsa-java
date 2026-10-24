// LC 347 Top K Frequent Elements
// Pattern: Count + Min-Heap (Custom Comparator)
// Time O(n log k) Space O(n)
// Medium 24 Oct 2026
// Signal: "Use a HashMap to store frequencies, then pass a custom comparator (a, b) -> map.get(a) - map.get(b) to a PriorityQueue. Iterate through map.keySet() and poll when size > k to automatically kick out the lowest frequencies."

import java.util.HashMap;
import java.util.PriorityQueue;

public class P0347TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (int key : map.keySet()) {
            pq.offer(key);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int res[] = new int[k];
        int i = 0;
        while (pq.peek() != null) {
            res[i] = pq.poll();
            i++;
        }

        return res;
    }
}
