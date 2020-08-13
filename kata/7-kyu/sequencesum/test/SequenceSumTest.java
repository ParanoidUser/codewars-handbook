import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SequenceSumTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{0, 1, 3, 6}, SequenceSum.sumOfN(3));
    assertArrayEquals(new int[]{0, -1, -3, -6, -10}, SequenceSum.sumOfN(-4));
    assertArrayEquals(new int[]{0, 1}, SequenceSum.sumOfN(1));
    assertArrayEquals(new int[]{0}, SequenceSum.sumOfN(0));
  }
}
