package fuzzy.doner;

import fuzzy.doner.DepthFirstSearchInGraph.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DepthFirstSearchInGraphTest {

    @Test
    public void depth_first_searching_for_graph(){
    /*
           A
        /  |  \
       B   C   D
      / \     / \
     E   F   G   H
        / \   \
       I   J   K
    */
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        Node h = new Node("H");
        Node i = new Node("I");
        Node j = new Node("J");
        Node k = new Node("K");
        a.children.add(b);
        a.children.add(c);
        a.children.add(d);
        b.children.add(e);
        b.children.add(f);
        f.children.add(i);
        f.children.add(j);
        d.children.add(g);
        d.children.add(h);
        g.children.add(k);
        List<String> traversal = DepthFirstSearchInGraph.traverse(a);
        assertThat(traversal, is(List.of("A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H")));
    }


}
