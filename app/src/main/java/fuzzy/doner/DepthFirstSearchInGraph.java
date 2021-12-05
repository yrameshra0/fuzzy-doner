package fuzzy.doner;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearchInGraph {
    public static List<String> traverse(Node root) {
        List<String> accumulator = new ArrayList<>();
        recursiveTraverse(root, accumulator);

        return accumulator;
    }

    private static void recursiveTraverse(Node root, List<String> accumulator){
        if(root!=null){
            accumulator.add(root.name);
        }

        root.children.forEach(node->recursiveTraverse(node, accumulator));
    }

    // Do not edit the class below except
    // for the depthFirstSearch method.
    // Feel free to add new properties
    // and methods to the class.
    public static class Node {
        String name;
        List<Node> children = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }
    }
}
