package fuzzy.doner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BinaryTreeBranchSum {
    private static Map<String, Integer> memoSum = new HashMap<>();

    public static List<Integer> generate(BinaryTree root) {
        memoSum.put(root.value+"", root.value);
        sumOfBranches(root, root.value+"");
        return memoSum.keySet().stream()
                .map(value->value.contains("LEAFSUM"))
                .map(value->memoSum.get(value))
                .collect(Collectors.toList());
    }

    private static void sumOfBranches(BinaryTree root, String key) {
        if(root.left==null && root.right==null){
            memoSum.put("LEAFSUM_"+key+root.value, memoSum.get(key)_+root.value);
            return;
        }
        String newKey = key+root.value;
        memoSum.put(key+root.value, memoSum.get(key)+root.value);
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


