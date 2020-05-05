import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SmallestIntegerFinderTest {
  @Test
  void sample() {
    assertEquals(11, SmallestIntegerFinder.findSmallestInt(new int[]{78, 56, 232, 12, 11, 43}));
    assertEquals(-33, SmallestIntegerFinder.findSmallestInt(new int[]{78, 56, -2, 12, 8, -33}));
    assertEquals(Integer.MIN_VALUE, SmallestIntegerFinder.findSmallestInt(new int[]{0, Integer.MIN_VALUE, Integer.MAX_VALUE}));
  }
}
