/*
21. Merge Two Sorted Lists
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergeTwoSortedList{
    //Time O(m + n)
    //Space O(m + n)
    public ListNode mergeSortedList(ListNode l1, ListNode l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val < l2.val){
            l1.next = mergeSortedList(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeSortedList(l1, l2.next);
            return l2;
        }
    }


    //Time
    public ListNode mergeSortedListIterative(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                current = l1;
                l1 = l1.next;
            } else{
                current = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        current.next = l1 == null ? l2 : l1;
        return dummy.next;
    }
}