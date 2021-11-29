package fuzzy.doner;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BinaryTreeBranchSumTest {
    @Test
    public void branch_sum_generator(){
        BinaryTreeBranchSum.BinaryTree root;
        List<Integer> sumOfBranches = BinaryTreeBranchSum.generate();
        assertThat(sumOfBranches, is(List.of(15, 16, 18, 10, 11)));
    }
}
