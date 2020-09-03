import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SortArrayTests {
  @Test
  void sample() {
    assertArrayEquals(new int[]{1, 2, 3}, SortArray.sortArray(new int[]{2, 3, 1}));
    assertArrayEquals(new long[]{1L, 2L, 3L}, SortArray.sortArray(new long[]{2L, 3L, 1L}));
    assertArrayEquals(new float[]{1F, 2F, 3F}, SortArray.sortArray(new float[]{2F, 3F, 1F}));
    assertArrayEquals(new double[]{1., 2., 3.}, SortArray.sortArray(new double[]{2., 3., 1.}));
    assertArrayEquals(new Object[]{"1", "2", "3"}, SortArray.sortArray(new Object[]{"2", "3", "1"}));
  }
}
