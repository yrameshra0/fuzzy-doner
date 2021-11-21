package fuzzy.doner;

public class FindClosestValueInBST {
    public static int findClosestValueInBst(BST bst, int target) {
        if(bst==null)
            return -1;

        if(target>bst.value){
            return findClosestValueInBst(bst.right, target);
        }
        if(target<bst.value){
            return findClosestValueInBst(bst.left, target);
        }

        return bst.value;
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