public class Partition {
    public void partitionList(LinkedListNode node, int partition) {
        if (node == null) return;
        LinkedListNode head = node;
        LinkedListNode tail = node;

        while(node != null){
            LinkedListNode nextNode = node.next;
            if(node.data < partition){
                node.next = head; // insert before the head
                head = node;      // changing head to the beginning
            } else {
                tail.next = node; //adding last after tail
                tail = node;      // shifting tail to the end
            }
            node = nextNode;      // runner
        }
        tail.next = null;           // make tail null
        return head;
    }
}