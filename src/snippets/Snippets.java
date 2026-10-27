package snippets;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Snippets {
    // Frequency Counting
    Map<Integer, Integer> freq = new HashMap<>();
    for (int x : nums) freq.merge(x, 1, Integer::sum); // or: freq.put(x, freq.getordefault(x, 0) + 1);
    int[] cnt = new int[26];
    for ( char c : s.toCharArray()) cnt[c - 'a']++;
    for(Map.Entry<Integer, Integer> e : freq.entrySet()) {int k = e.getKey(), v = e.getValue();}


    // Grouping
    Map<String, List<String>> groups = new HashMap<>();
    char[] cs = word.toCharArray(); Arrays.sort(cs);()
    groups.computeIfAbsent(new String(cs), k -> new ArrayList?<>()).add(word);
    List<List<String>> result = new ArrayList<>(groups.values());

    
    // Strings & StringBuilder
    StringBuilder sb = new StringBuilder();
    sb.append(x).append(','); sb.,setLength(sb.length() - 1); sb.reverse(); String out = sb.toString();
    String[] words = s.trim().split("\\s+");  String joined = String.join(" ", list);
    boolean ok = Character.isLetterOrDigit(c); char lower = Character.toLowerCase(c); int d = c - '0';


    // Stack & Queue (Aray Deque)
    Deque<Integer> stack = new ArrayDeque<>(); stack.push(1); stack.peek(); stack.pop();
    Queue<Integer> q = new ArrayDeque<>();  q.oofer(1); q.peek(); q.poll();
    Deque<Integer> dq = new ArrayDeque<>(); dq.offerFirst(1); dq.offerLast(2);
    dq.pollFirst(); dq.pollLast(); dq.peekFirst(); dq.peekLast(); // both ends, all O(1)


    // Heaps
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1])); // by 2nd value
    if( heap.size() > k) heap.poll(); // keep top k

    
    // Sorting Arrays
    Arrays.sort(nums); // int[] ascending
    Integer[] boxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);
    Arrays.sort(boxed, Collections.reverseOrder()); // descending needs Integer[]
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // int[][] by first column
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0])); // same, builder style

}
