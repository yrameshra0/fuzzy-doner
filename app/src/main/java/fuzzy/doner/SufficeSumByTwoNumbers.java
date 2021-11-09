package fuzzy.doner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SufficeSumByTwoNumbers
{
    public static int[] twoNumberSum(int[] array, int targetSum){
        Map<Integer, Boolean> numberMap = new HashMap<>();
        Arrays.stream(array).forEach(value-> numberMap.put(value, true));

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int pendingSum = targetSum - value;
            if(numberMap.containsKey(pendingSum) && pendingSum!=value){
                return new int[] {value, pendingSum};
            }
        }

        return new int[0];
    }

    /** Additionally what we can try doing more
     * 1. In place of HashMap we can use hash set
     * 2. 2 Pointer Moving and summing is also valid solve
     */
}
