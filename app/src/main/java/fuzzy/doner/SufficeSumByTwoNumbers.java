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
}
