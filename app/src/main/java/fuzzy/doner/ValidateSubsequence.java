package fuzzy.doner;

import java.util.ArrayList;
import java.util.List;

public class ValidateSubsequence {
    public static boolean isValidSubsequence(List<Integer> inputArray, List<Integer> sequence) {
        List<Integer> clonedArray = new ArrayList<>(sequence);
        inputArray.forEach(value->{
            if(clonedArray.isEmpty())
                return;
            Integer firstValue = clonedArray.remove(0);
            if(!value.equals(firstValue)){
                clonedArray.add(0, firstValue);
            }
        });

        return clonedArray.isEmpty();
    }

    /**
     * Improvisations:
     * 1. 2 Indexes walking method
     * 2. Update index while match found
     * Current approach is good but to many moving parts can be proved hence
     */
}
