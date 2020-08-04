public class RemoveDups{
    public void removeDups(LinkedListNode head){
        if(head == null) return;
        Set<Integer> set = new HashSet<Integer>();
        LinkedListNode previous = null;
        LinkedListNode node = head;
        while(node != null){
            if(set.contains(node.data)){
                previous.next = node.next;
            } else {
                set.add(node.data);
                previous = node;
            }
            node = node.next;
        }
    }

    public void removeDupsNoBuffer(LinkedListNode head){
        if(head == null) return;
        LinkedListNode current = head;
        while(current != null){
            LinkedListNode runner = current;
            while(runner.next != null) {
                if (current.data == runner.next.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}