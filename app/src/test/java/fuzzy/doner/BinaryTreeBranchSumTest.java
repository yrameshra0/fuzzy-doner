package fuzzy.doner;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BinaryTreeBranchSumTest {
    @Test
    public void branch_sum_generator(){
        BinaryTreeBranchSum.BinaryTree root;
        root = new BinaryTreeBranchSum.BinaryTree(1);
        root.left = new BinaryTreeBranchSum.BinaryTree(2);
        root.right = new BinaryTreeBranchSum.BinaryTree(3);
        root.left.left = new BinaryTreeBranchSum.BinaryTree(4);
        root.left.right = new BinaryTreeBranchSum.BinaryTree(5);
        root.left.left.left = new BinaryTreeBranchSum.BinaryTree(8);
        root.left.left.right = new BinaryTreeBranchSum.BinaryTree(9);
        root.left.right.left = new BinaryTreeBranchSum.BinaryTree(10);
        root.right.left = new BinaryTreeBranchSum.BinaryTree(6);
        root.right.right = new BinaryTreeBranchSum.BinaryTree(7);

        List<Integer> sumOfBranches = BinaryTreeBranchSum.generate();
        assertThat(sumOfBranches, is(List.of(15, 16, 18, 10, 11)));
    }
}
