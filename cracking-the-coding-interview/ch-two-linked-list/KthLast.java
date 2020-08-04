//Implement algorithm to find the Kth to last elent of singly linked list

public class KthLast{
    //version#1 using 2 pointer and iterative
    LinkedListNode returnKthLast(LinkedListNode head, int k){
        if(head == null) return null;

        LinkedListNode p1 = head;
        LinkedListNode p2 = head;

        /*   Modified K so not so good
        while(k > 0 && p1 != null){
            p1 = p1.next;
        }
        if(k > 0) return null;
       */

       for(int i = 0; i < k; i++){
           if(p1 == null) return null; //Out of bounds
           p1 = p1.next;
       }

        while(p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }

    //version #2 recursive
    class Index{
        public int value = 0;
    }
    LinkedListNode kthToLast(LinkedListNode head, int k){
        Index idx = new Index();
        return kthToLast(head, k , idx);
    }
    LinkedListNode kthToLast(LinkedListNode head, int k, Index idx){
        if(head == null) return null;

        LinkedListNode node = kthToLast(head.next, k, idx);
        idx.value = idx.value + 1;
        if(idx.value == k){
            return head;
        }
        return node;
    }
}