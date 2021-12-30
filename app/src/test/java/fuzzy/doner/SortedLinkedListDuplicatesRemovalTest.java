package fuzzy.doner;

import fuzzy.doner.SortedLinkedListDuplicateRemoval.LinkedList;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SortedLinkedListDuplicatesRemovalTest {

    private LinkedList createListFromArray(int[] values) {
        LinkedList[] nodes = new LinkedList[values.length];
        for (int i = 0; i < values.length; i++) {
            nodes[i] = new LinkedList(values[i]);
        }
        LinkedList linkedList = null;
        for (int i = 0; i < nodes.length; i++) {
            if (linkedList == null) {
                linkedList = nodes[i];
            } else {
                LinkedList previous = nodes[i - 1];
                previous.next = nodes[i];
            }
        }
        return linkedList;
    }

    @Test
    public void duplicatesRemovedList() {
        // Sorted Linked List
        // 1->1->3->4->4->4->5->6->6
        LinkedList inputList = createListFromArray(new int[]{1, 1, 3, 4, 4, 5, 6, 6});

        LinkedList expectedList = createListFromArray(new int[]{1, 3, 4, 5, 6});

        LinkedList actualList = SortedLinkedListDuplicateRemoval.removeDuplicateFromList(inputList);

        while (expectedList != null) {
            assertThat("LinkedList is not matching", expectedList.value, is(actualList.value));
            expectedList = expectedList.next;
            actualList = actualList.next;
        }
    }
}
