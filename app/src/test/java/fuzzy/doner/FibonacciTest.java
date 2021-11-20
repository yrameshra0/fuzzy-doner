package fuzzy.doner;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FibonacciTest {

    @Test
    public void recursive_fibonacci_generation() {
        FibonacciGen series = new FibonacciGen();

        assertThat(series.recursiveGenerator(10), is(55));
        assertThat(series.totalCalls, is(177));
    }

    @Test
    public void recursive_fibonacci_generation_with_memoization() {
        FibonacciGen series = new FibonacciGen();

        assertThat(series.recursiveGeneratorMemoization(10), is(55));
        assertThat(series.totalCalls, is(19));
    }

    @Test
    public void iterative_fibonacci_generation() {
        FibonacciGen series = new FibonacciGen();

        assertThat(series.iterativeGenerator(10), is(55));
        assertThat(series.totalCalls, is(10));
    }

    @Test
    public void stream_fibonacci_generation() {
        FibonacciGen series = new FibonacciGen();

        assertThat(series.streamGenerator().limit(10).toArray(), is(new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55}));
        assertThat(series.totalCalls, is(10));
    }

}
