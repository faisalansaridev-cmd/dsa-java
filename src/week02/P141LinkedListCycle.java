// LC 141 Linked List Cycle
// Pattern: Floyd's Fast and Slow Pointers (Two-Pointer)
// Time O(n) Space O(1)
// Easy 24 Oct 2026
// Signal: "Use ListNode objects, not integers. Move pointers first before checking equality to prevent false positives at the head. Loop condition must check fast != null && fast.next != null to avoid NullPointerExceptions."

public class P141LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}
