package fuzzy.doner;

public class SortedLinkedListDuplicateRemoval {

    public static class LinkedList{
        public final int value;
        public LinkedList next;
        LinkedList(int value){
            this.value = value;
            this.next = null;
        }
    }

    public static LinkedList removeDuplicateFromList(LinkedList linkedList) {
        LinkedList currentNode = linkedList;
        while (currentNode!=null){
            LinkedList nextNonDuplicateNode = currentNode.next;

            while (nextNonDuplicateNode!=null && nextNonDuplicateNode.value==currentNode.value){
                nextNonDuplicateNode = nextNonDuplicateNode.next;
            }

            currentNode.next = nextNonDuplicateNode;
            currentNode = nextNonDuplicateNode;
        }

        return linkedList;
    }
}
