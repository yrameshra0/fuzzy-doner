package fuzzy.doner;

import com.google.common.primitives.Ints;
import org.junit.jupiter.api.Test;

import static fuzzy.doner.FindClosestValueInBST.BST;
import static fuzzy.doner.FindClosestValueInBST.findClosestValueInBst;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FindClosestValueInBSTTest {
    @Test
    public void bst_with_no_match() {
        BST binarySearchTree = new BST(10);
        assertThat(Ints.asList(findClosestValueInBst( binarySearchTree, 1)), is(-1));
    }

    @Test
    public void bst_with_nearest_match() {
        BST binarySearchTree = new BST(10);
        binarySearchTree.left = new BST(5);
        binarySearchTree.right=new BST(15);
        assertThat(Ints.asList(findClosestValueInBst( binarySearchTree, 6)), is(10));
    }
}
