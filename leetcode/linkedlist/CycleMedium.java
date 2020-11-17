/*
142. Linked List Cycle II
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycleSet(ListNode head) {
        if(head == null){
            return null;
        }
        Set<ListNode> set = new HashSet<>();
        while(head != null){
            if(set.contains(head)){
                return head;
            } else {
                set.add(head);
            }
            head = head.next;
        }
        return null;
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode intersect = findIntersectionNode(head);
        if(intersect == null) {
            return null;
        }

        ListNode p1 = head;
        ListNode p2 = intersect;
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
    public ListNode findIntersectionNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }
        }
        return null;
    }
}