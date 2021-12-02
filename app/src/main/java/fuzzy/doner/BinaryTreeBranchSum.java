package fuzzy.doner;

import java.util.*;

public class BinaryTreeBranchSum { private static Map<String, Integer> memoSum = new HashMap<>();
    private static List<Integer> leafSum = new LinkedList<>();

    public static List<Integer> branchSums(BinaryTree root) {
        memoSum.clear();
        leafSum.clear();
        sumOfBranches(root, "");
        return leafSum;
    }

    private static void sumOfBranches(BinaryTree root, String key) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            leafSum.add(memoSum.getOrDefault(key, 0) + root.value);
            return;
        }
        String newKey = key + root.value;
        memoSum.put(key + root.value, memoSum.getOrDefault(key, 0) + root.value);
        sumOfBranches(root.left, newKey);
        sumOfBranches(root.right, newKey);
    }

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

}


