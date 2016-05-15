package graphs;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Given a directed graph find if there is a route between nodes
 * Created by domesc on 23/02/16.
 */
public class RouteBetweenNodes {
    /**Using Breadth-First*/
    public boolean checkRouteExistsBF(GraphNode<Integer> from, GraphNode<Integer> to) {
        Queue<GraphNode<Integer>> queue = new ArrayDeque<>();
        from.setMarked(true);
        queue.add(from);

        while (!queue.isEmpty()) {
            GraphNode<Integer> n = queue.remove();
            for (GraphNode<Integer> node : n.getAdjacencyList()) {
                if (node.getValue().equals(to.getValue()))
                    return true;
                if (!node.isMarked()) {
                    node.setMarked(true);
                    queue.add(node);
                }
            }
        }

        return false;
    }

    /**Using Depth-First*/
    public boolean checkRouteExistsDF(GraphNode<Integer> from, GraphNode<Integer> to) {
        if (from == null) {
            return false;
        }
        from.setMarked(true); // visit the GraphNode

        if (from.getValue().equals(to.getValue())) {
            return true;
        }
        for (GraphNode<Integer> n : from.getAdjacencyList()) {
            if (checkRouteExistsDF(n, to))
                return true;
        }
        return false;

    }
}
