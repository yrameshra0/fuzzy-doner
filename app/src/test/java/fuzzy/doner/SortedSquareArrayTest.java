package fuzzy.doner;

import com.google.common.primitives.Ints;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SortedSquareArrayTest {
    @Test
    public void sorted_square_array_all_positive(){
        assertThat(Ints.asList(SortedSquareArray.square(new int[]{1, 2, 3, 4, 5})), containsInRelativeOrder(1, 4, 9, 16, 25));
    }

    @Test
    public void sorted_square_array_all_negative(){
        assertThat(Ints.asList(SortedSquareArray.square(new int[]{-5, -4, -3, -2, -1})), containsInRelativeOrder(1, 4, 9, 16, 25));
    }


    @Test
    public void sorted_square_array_mixed(){
        assertThat(Ints.asList(SortedSquareArray.square(new int[]{-10, -5, 0, 5, 10})), containsInRelativeOrder(0, 25, 25, 100, 100));
    }
}
