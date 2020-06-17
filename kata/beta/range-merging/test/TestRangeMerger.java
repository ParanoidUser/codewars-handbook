import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class TestRangeMerger {
  @Test
  void sample() {
    assertArrayEquals(new int[0], RangeMerger.merge(new int[0]));
    assertArrayEquals(new int[]{1, 5, 7, 9}, RangeMerger.merge(new int[]{1, 3, 2, 5, 7, 9}));
    assertArrayEquals(new int[]{1, 1}, RangeMerger.merge(new int[]{1, 1}));
    assertArrayEquals(new int[]{1, 11}, RangeMerger.merge(new int[]{7, 11, 6, 9, 1, 5}));
    assertArrayEquals(new int[]{-5, 3}, RangeMerger.merge(new int[]{-5, -1, -1, 3}));
    assertArrayEquals(new int[]{0, 2}, RangeMerger.merge(new int[]{0, 0, 1, 1, 2, 2}));
    assertArrayEquals(new int[]{2, 3}, RangeMerger.merge(new int[]{2, 3, 2, 3}));
    assertArrayEquals(new int[]{0, 0}, RangeMerger.merge(new int[]{0, 0, 0, 0}));
    assertArrayEquals(new int[]{1, 5}, RangeMerger.merge(new int[]{1, 5, 2, 3}));
  }
}
