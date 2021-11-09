package fuzzy.doner;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateSubsequenceTest {

    @Test
    public void nonContiguousSubsequence() {
        List<Integer> inputArray = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);

        assertThat(ValidateSubsequence.isValidSubsequence(inputArray, sequence), is(true));
    }

    @Test
    public void contiguousSubsequence() {
        List<Integer> inputArray = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 22, 25, 6);

        assertThat(ValidateSubsequence.isValidSubsequence(inputArray, sequence), is(true));
    }

    @Test
    public void notASubsequence(){
        List<Integer> inputArray = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 25, 22, 6);

        assertThat(ValidateSubsequence.isValidSubsequence(inputArray, sequence), is(false));
    }
}
