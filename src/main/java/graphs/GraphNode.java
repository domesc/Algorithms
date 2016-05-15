package graphs;

/**
 * Generic class for representing a GraphNode in a Graph
 * Created by domesc on 23/02/16.
 */
public class GraphNode<T> {
    private T value;
    private GraphNode<T>[] adjacencyList;
    private boolean marked;

    public GraphNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public GraphNode<T>[] getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(GraphNode<T>[] adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

}
