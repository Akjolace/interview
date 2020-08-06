public class Palindrome{

    //Ctci version #2 using 2 pointer and Stack
    public boolean isPalindrome(LinkedListNode head){
        LinkedListNode slow = head;
        LinkedListNode fast = head;
        Stack<Integer> st = new Stack<Integer>();

        while(fast != null && fast.next != null){
            st.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null){
            slow = slow.next; // if the linked list has a odd number nodes
        }

        while(slow != null){
            int val = st.pop().data;
            if(val != slow.data){
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    //Ctci version #1 Using reverse whole linked list and compare
    public boolean isPalindrome(LinkedListNode head){
        LinkedListNode reverse = reverseAndClone(head);
        return isEqual(reverse, head);
    }

    public LinkedListNode reverseAndClone(LinkedListNode head){
        LinkedListNode prev = null;
        while(head != null){
            LinkedListNode node = new LinkedListNode(head.val);
            node.next = prev;
            prev = node;
            head = head.next;
        }
        return prev;
    }

    public boolean isEqual(LinkedListNode l1, LinkedListNode l2){
        while(l1 != null && l2 != null){
            if(l1.data != l2.data){
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return (l1 == null && l2 == null);
    }


    //Option 1 reverse
    public boolean isPalindromeList(LinkedListNode head){
        if(head == null) return true;
        LinkedListNode revHead = reverseList(head);

        while(head != null){
            if(head.data != revHead.data){
                return false;
            }
            revHead = revHead.next;
            head = head.next;
        }
        return true;
    }
    public LinkedListNode reverseList(LinkedListNode head){
        if(head == null || head.next == null) return head;
        LinkedListNode realHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return realHead;
    }

    //Option 2 Using Stack
    public boolean isPalindromeList(LinkedListNode head){
        if(head == null) return true;
        LinkedListNode runnerNode = head;
        Stack<LinkedListNode> st = new Stack<LinkedListNode>();
        while(runnerNode != null){
            st.push(runnerNode);
            runnerNode = runnerNode.next;
        }

        while(!st.isEmpty()){
            LinkedListNode top = st.pop();
            if(head.data != top.data){
                return false;
            }
            head = head.next;
        }
        return true;
    }


}