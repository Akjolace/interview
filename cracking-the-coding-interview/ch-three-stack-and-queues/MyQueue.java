//implementing Queue

public class MyQueue<T>{
    private static class QueueNode<T>{
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data){
            this.data = data;
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;

    public void add(T item){
        QueueNode<T> t = new QueueNode<T>(item);
        if(last != null){
            last.next = t;
        }
        last = t;
        if(first == null){
            first = last;
        }
    }

    public QueueNode<T> remove(){
        if(first == null) throw new QueueEmptyException();
        T item = first.data;
        first = first.next;
        if(first == null){
            last == null;
        }
        return item;
    }

    public QueueNode<T> peek(){
        if(first == null) throw new QueueEmptyException();
        return first.data;
    }

    public boolean isEmpty(){
        return first == null;
    }
}