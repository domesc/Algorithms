import graphs.GraphNode;
import graphs.RouteBetweenNodes;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by domesc on 15/05/16.
 */
public class GraphsTest {
    @Test
    public void routeBeetweenNodesTest() {
        RouteBetweenNodes algo = new RouteBetweenNodes();
        GraphNode<Integer>[] nodes = createGraph();
        Assert.assertTrue(algo.checkRouteExistsBF(nodes[0], nodes[3]));
        Assert.assertFalse(algo.checkRouteExistsBF(nodes[4], nodes[2]));
        Assert.assertTrue(algo.checkRouteExistsBF(nodes[1], nodes[3]));

        Assert.assertTrue(algo.checkRouteExistsDF(nodes[0], nodes[3]));
        Assert.assertFalse(algo.checkRouteExistsDF(nodes[4], nodes[2]));
        Assert.assertTrue(algo.checkRouteExistsDF(nodes[1], nodes[3]));
    }

    private GraphNode<Integer>[] createGraph() {
        GraphNode<Integer> node0 = new GraphNode<>(0);
        GraphNode<Integer> node1 = new GraphNode<>(1);
        GraphNode<Integer> node2 = new GraphNode<>(2);
        GraphNode<Integer> node3 = new GraphNode<>(3);
        GraphNode<Integer> node4 = new GraphNode<>(4);
        GraphNode<Integer> node5 = new GraphNode<>(5);
        node0.setAdjacencyList(new GraphNode[]{node1, node4, node5});
        node1.setAdjacencyList(new GraphNode[]{node3, node4});
        node2.setAdjacencyList(new GraphNode[]{node1});
        node3.setAdjacencyList(new GraphNode[]{node2, node4});
        node4.setAdjacencyList(new GraphNode[]{});
        node5.setAdjacencyList(new GraphNode[]{});

        return new GraphNode[]{node0, node1, node2, node3, node4, node5};
    }
}
