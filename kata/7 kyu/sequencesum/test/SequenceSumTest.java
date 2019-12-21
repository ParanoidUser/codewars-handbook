import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SequenceSumTest {
  @Test
  public void testKnownValues() {
    assertArrayEquals(new int[] {0, 1, 3, 6}, SequenceSum.sumOfN(3));
    assertArrayEquals(new int[] {0, -1, -3, -6, -10}, SequenceSum.sumOfN(-4));
    assertArrayEquals(new int[] {0, 1}, SequenceSum.sumOfN(1));
    assertArrayEquals(new int[] {0}, SequenceSum.sumOfN(0));
  }
}
