//Given linked list might contain a loop, implement algorithm that returns
public class LoopDetection{
    public LinkedListNode loopDetection(LinkedListNode head){
        if(head == null) return null;
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        //Find the meeting point
        while(fast != null && fast.next != null || slow != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
        }

        //If no meeting point return null
        if(fast == null || fast.next == null){
            return null;
        }

        //Keep distance k at meeting point. and go through same speed
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}