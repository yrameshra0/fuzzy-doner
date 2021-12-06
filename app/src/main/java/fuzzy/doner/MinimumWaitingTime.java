package fuzzy.doner;

import java.util.*;

public class MinimumWaitingTime {
    public static int calculateWithExtraStorage(int[] queries) {
        if (queries.length == 1) {
            return 0;
        }

        if (queries.length == 2) {
            return Arrays.stream(queries).sorted().findFirst().getAsInt();
        }

        LinkedList<Integer> checkpoint = new LinkedList<>();

        /**
         * For Calculating Minimum Waiting Time for multiple queries
         * 1. Sort the array (Enables us to be greedy to pick the lowest execution time required queries first)
         * 2. Iterate on the queries and generate final execution time
         * 3. For each element in the queries add the execution and store it in an separate array
         * Additional storage of saving sum till at location
         */

        Arrays.stream(queries).sorted().forEach(value -> checkpoint.add(Optional.ofNullable(checkpoint.peekLast()).orElse(0)+value));
        checkpoint.removeLast();

        return checkpoint.stream().mapToInt(Integer::intValue).sum();
    }

    public static int calculateWithoutAdditionalStorate(int[] queries){
        /**
         * For Calculating Minimum Waiting Time for multiple queries
         * 1. Sort the array (Enables us to be greedy to pick the lowest execution time required queries first)
         * 2. Iterate on the queries and generate final execution time
         * 3. For each element in the queries add the execution time till end like
         * [1,2,2,3,6] => At 1 the totalExecutionTime Will be 1*(Array Length - index) i.e. 1 * (5-1) i.e. 1*4
         * Above logic significance is that 1 will need to be added a total of 4 times anyways in the total
         * execution calculation
         */
        return 0;
    }
}
