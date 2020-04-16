import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertEquals(13, Minimum.minValue(new int[] {1, 3, 1}));
    assertEquals(457, Minimum.minValue(new int[] {4, 7, 5, 7}));
    assertEquals(148, Minimum.minValue(new int[] {4, 8, 1, 4}));
    assertEquals(579, Minimum.minValue(new int[] {5, 7, 9, 5, 7}));
    assertEquals(678, Minimum.minValue(new int[] {6, 7, 8, 7, 6, 6}));
  }
}
