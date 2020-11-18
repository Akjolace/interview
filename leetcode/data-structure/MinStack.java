/*
155. Min Stack
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 */

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

public class MinStack{
    private Node top;

    public MinStack(){

    }

    public void push(int x){
        if(top == null){
            top = new Node(x, x, null);
        } else {
            top = new Node(x, Math.min(top.min, x), top);
        }
    }

    public void pop(){
        top = top.next;
    }

    public int getMin(){
        return top.min;
    }

    public int top(){
        return top.val;
    }

    class Node{
        int val;
        int min;
        Node next;
        public Node(){

        }
        public Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}