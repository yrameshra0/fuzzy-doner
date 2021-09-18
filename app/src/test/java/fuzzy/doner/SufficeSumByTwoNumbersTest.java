package fuzzy.doner;

import com.google.common.primitives.Ints;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class SufficeSumByTwoNumbersTest {

    private static final int[] SIMPLE_ARRAY = new int[]{3, 5, -4, 8, 11, 1, -1, 6};

    @Test
    void twoNumberSum() {
        int[] returnedSum = SufficeSumByTwoNumbers.twoNumberSum(SIMPLE_ARRAY, 10);

        assertThat(Ints.asList(returnedSum), containsInAnyOrder(-1, 11));
    }
}