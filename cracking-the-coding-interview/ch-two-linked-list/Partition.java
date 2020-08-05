public class Partition{
    public void partitionList(LinkedListNode head, int partition){
        if(head == null) return;

        LinkedListNode lowerHead = null;
        LinkedListNode greatherHead = null;

        while(head != null){
            if(head.data < partition){
//                if(lowerHead == null){
//                    lowerHead.data = head.data;
//                }
                lowerHead.next = head;
            } else {
                greatherHead.next = head;
            }
        }
        lowerHead.next = null;
        greatherHead.next = null;

    }
}