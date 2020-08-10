enum State{
    Unvisited, Visited, Visiting;
}

public class RouteBetweenNodes{

    boolean search(Graph g, Node start, Node end){
        if(start == end) return true;
        //operates queue LinkedList<Node> q = new LinkedList<Node>();
        Queue<Node> queue = new LinkedList<Node>();
        for(Node u : g.getNodes()){
            u.state = State.Unvisited;
        }
        start.state = State.Visiting;
        queue.add(start);
        Node u;
        while(!queue.isEmpty()){
            u = queue.removeFirst(); // dequeue
            if (u != null) {
                for(Node v: u.getAdjacent){
                    if(v.state == State.Unvisited){
                        if(v == end){
                            return true;
                        } else {
                            v.state = State.Visiting;
                            q.add(v);
                        }
                    }
                }
                u.state = State.Visited;
            }
        }
        return false;
    }
}