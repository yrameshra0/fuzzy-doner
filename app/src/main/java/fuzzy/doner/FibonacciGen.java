package fuzzy.doner;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class FibonacciGen {
    public Integer totalCalls = 0;
    private Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1, 1));
    private int last = 0;
    private int next = 1;

    public Integer recursiveGenerator(Integer uptoNumber) {
        totalCalls++;

        if (uptoNumber < 2) return uptoNumber;
        return recursiveGenerator(uptoNumber - 1) + recursiveGenerator(uptoNumber - 2);
    }

    public Integer recursiveGeneratorMemoization(Integer uptoNumber) {
        totalCalls++;
        if (!memo.containsKey(uptoNumber)) {
            memo.put(uptoNumber, recursiveGeneratorMemoization(uptoNumber - 1) + recursiveGeneratorMemoization(uptoNumber - 2));
        }

        return memo.get(uptoNumber);
    }

    public Integer iterativeGenerator(Integer uptoNumber) {
        for (int i = 0; i < uptoNumber; i++) {
            totalCalls++;
            int oldLast = last;
            last = next;
            next = oldLast + next;
        }
        return last;
    }

    public IntStream streamGenerator() {
        return IntStream.generate(() -> {
            totalCalls++;
            int oldLast = last;
            last = next;
            next = oldLast + next;
            return last;
        });
    }
}
