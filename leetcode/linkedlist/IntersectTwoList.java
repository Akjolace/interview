/*
160. Intersection of Two Linked Lists
Write a program to find the node at which the intersection of two singly linked lists begins.
Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Each value on each linked list is in the range [1, 10^9].
Your code should preferably run in O(n) time and use only O(1) memory.
 */

public class IntersectTwoList{
    //1. First define there is a intersection or Not
        // Union A's last to B's head; (Making intersection)
        // For this approach using 2 pointer (Floyd's cycle)
    //2.Return that node
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        //Connecting a's last to b'head
        ListNode endA = headA;
        while(endA.next != null){
            endA = endA.next;
        }
        endA.next = headB;

        //if there is no cycle it has to return null
        ListNode start = null;

        //looking for intersection following 2 pointer Floyd cycle
        ListNode slow = headA;
        ListNode fast = headA;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                //Has cycle. Now have to find a intersect Node
                start = headA;
                while(slow != start){
                    slow = slow.next;
                    start = start.next;
                }
                break;
            }
        }
        endA.next = null;
        return start;
    }
}