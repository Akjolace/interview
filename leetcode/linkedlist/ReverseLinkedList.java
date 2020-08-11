/*
206. Reverse Linked List
        Reverse a singly linked list.

        Example:

        Input: 1->2->3->4->5->NULL
        Output: 5->4->3->2->1->NULL
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
public class ReverseLinkedList{
    public ListNode reverseLL(ListNode head){
        if(head == null || head.next == null) return head;
        Stack<ListNode> stack = new Stack<ListNode>();
        while(head != null){
            st.push(head);
            head = head.next;
        }

        ListNode dummy = new ListNode(-1);
        dummy = head;
        while(!stack.isEmpty()){
            ListNode top = stack.pop();
            head.next = new ListNode(top.val);
            head = head.next;
        }
        return dummy.next;
    }
}