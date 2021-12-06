package fuzzy.doner;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MinimumWaitingTimeTest {
    @Test
    public void min_wait_time_for_single_query(){
        int minWaitTime = MinimumWaitingTime.calculateWithExtraStorage(new int[]{100});
        assertThat(minWaitTime, is(0));
    }

    @Test
    public void min_wait_time_for_2_queries(){
        int minWaitTime = MinimumWaitingTime.calculateWithExtraStorage(new int[]{100, 1});
        assertThat(minWaitTime, is(1));
    }

    @Test
    public void min_wait_time_for_all_queries(){
        int minWaitTime = MinimumWaitingTime.calculateWithExtraStorage(new int[]{6, 3, 1, 2, 2});
        assertThat(minWaitTime, is(17));
    }
}
