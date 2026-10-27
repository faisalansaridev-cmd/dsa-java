// LC 1051 Height Checker
// Pattern: Counting Sort / Frequency Map
// Time O(N) Space O(1)
// Easy 27 Oct 2026
// Signal: "Use a fixed array of size 101 to count frequencies of each height. Iterate through the frequency buckets (1 to 100) and compare the expected sorted height (j) against the original heights array at index i to count mismatches in O(N) time."

public class P1051HeightChecker {
    public int heightChecker(int[] heights) {
        int[] arr = new int[101];

        for (int i = 0; i < heights.length; i++) {
            arr[heights[i]] += 1;
        }

        int count = 0;
        int i = 0; 

        for (int j = 1; j < 101; j++) {
            while (arr[j] > 0) {
                if (heights[i] != j) {
                    count++;
                }
                arr[j]--; 
                i++;      
            }
        }

        return count;
    }
}
