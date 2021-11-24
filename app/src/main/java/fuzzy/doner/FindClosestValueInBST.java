package fuzzy.doner;

public class FindClosestValueInBST {
    private static BST lessNode;
    private static BST moreNode;
    private static BST equalNode;

    private static void findClosestRecursive(BST bst, int target) {
        if (bst == null)
            return;

        if (target == bst.value) {
            equalNode = new BST(bst.value);
            return;
        }

        if (target > bst.value) {
            lessNode = new BST(bst.value);
            findClosestRecursive(bst.right, target);
        }
        if (target < bst.value) {
            moreNode = new BST(bst.value);
            findClosestRecursive(bst.left, target);
        }
    }

    public static int findClosestValueInBst(BST bst, int target) {
        equalNode = null;
        lessNode = null;
        moreNode = null;

        findClosestRecursive(bst, target);
        if (equalNode != null)
            System.out.println("equalNode :: " + equalNode.value);
        if (moreNode != null)
            System.out.println("moreNode :: " + moreNode.value);
        if (lessNode != null)
            System.out.println("lessNode :: " + lessNode.value);


        if (equalNode != null)
            return equalNode.value;

        if (moreNode != null && lessNode != null) {
            if (Math.abs(target - moreNode.value) < Math.abs(target - lessNode.value)) {
                return moreNode.value;
            }
            return lessNode.value;
        }


        if (moreNode != null)
            return moreNode.value;

        if (lessNode != null)
            return lessNode.value;

        return -1;
    }

    static class BST {
        public int value;
        public BST right;
        public BST left;

        public BST(int value) {
            this.value = value;
        }
    }
}