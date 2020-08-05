//Implement algorithm to delete Node in the middle, given only acces to that node

public class DeleteMiddleNode{
    public boolean deleteMiddle(LinkedListNode node){
        if(head == null || head.next == null)
            return false;
        node.data = node.next.data;
        node.next = node.next.next;
        return true;
    }
}