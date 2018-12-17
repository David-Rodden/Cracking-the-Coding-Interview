package chapter_4;

import javax.swing.tree.TreeNode;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Problem 4.1
 * Given a directed graph, design an algorithm to find out whether there is a route between two nodes
 */
class RouteBetweenNodes {
    static boolean linkExists(final TreeNode start, final TreeNode end) {
        // We can represent a directed graph with TreeNodes
        // Graph is unweighted so we can use Breadth First Search
        final Queue<TreeNode> toVisit = new LinkedList<>(Collections.list(start.children()));
        // Retaining the path doesn't matter in this scenario, just whether one exists
        while (!toVisit.isEmpty()) {
            final TreeNode observed = toVisit.remove();
            // If a path exists, we will find one as a child that has been added to the queue
            if (observed.equals(end)) return true;
            if (observed.getChildCount() == 0) continue;
            // We continue our search with the node's children until it has or hasn't been found
            toVisit.addAll(Collections.list(observed.children()));
        }
        return false;
    }
}
