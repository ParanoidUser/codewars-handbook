import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SmallestIntegerFinderTest {

  @Test
  public void example1() {
    assertEquals(11, SmallestIntegerFinder.findSmallestInt(new int[] {78, 56, 232, 12, 11, 43}));
  }

  @Test
  public void example2() {
    assertEquals(-33, SmallestIntegerFinder.findSmallestInt(new int[] {78, 56, -2, 12, 8, -33}));
  }

  @Test
  public void example3() {
    assertEquals(Integer.MIN_VALUE, SmallestIntegerFinder.findSmallestInt(new int[] {0, Integer.MIN_VALUE, Integer.MAX_VALUE}));
  }
}
