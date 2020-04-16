import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void sampleTest() {
    assertTrue(Kata.isNice(new Integer[] {1, 2, 3, 4, 5}));
    assertTrue(Kata.isNice(new Integer[] {5, 4, 3, 2, 1}));
    assertFalse(Kata.isNice(new Integer[] {1, 3, 5, 2}));
    assertFalse(Kata.isNice(new Integer[] {10, 10, 2, 2, 3}));
    assertFalse(Kata.isNice(new Integer[0]));
    assertFalse(Kata.isNice(new Integer[] {1}));
  }
}
