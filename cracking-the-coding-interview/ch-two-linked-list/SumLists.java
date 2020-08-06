public class SumLists{
    public LinkedListNode sumReverseList(LinkedListNode l1, LinkedListNode l2){
        return addLists(l1, l2, 0);
    }

    LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2, int carry){
        if(l1 == null && l2 == null && carry == 0){
            return null;
        }

        LinkedListNode result = new LinkedListNode();

        int sum = carry;
        if(l1 != null) {
            sum += l1.data;
        }
        if(l2 != null){
            sum += l2.data;
        }

        result.data = sum % 10;
        carry = (sum > 10) ? 1 : 0;

        if(l1 != null || l2 != null){
            LinkedListNode more = addLists(
                    l1 == null ? null : l1,
                    l2 == null ? null : l2, carry);
            result.setNext = more;
        }
        return result;
    }
}