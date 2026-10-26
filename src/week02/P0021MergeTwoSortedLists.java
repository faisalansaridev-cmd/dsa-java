// LC 21 Merge Two Sorted Lists
// Pattern: Dummy Node / Two-Pointer
// Time O(N+M) Space O(1)
// Easy 26 Oct 2026
// Signal: "Use a dummy node to anchor the new list. Compare list1 and list2 nodes, wire current.next to the smaller node, and advance both the chosen list and current pointers. Attach the non-null remaining list at the end."

public class P0021MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            } else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 != null){
            current.next = list1;
        } else{
            current.next = list2;
        }

        return dummy.next;
    }
}
