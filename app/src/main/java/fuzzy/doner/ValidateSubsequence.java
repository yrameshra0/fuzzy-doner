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
            if(value!=firstValue){
                clonedArray.add(0, firstValue);
            }
        });

        return clonedArray.isEmpty();
    }
}
