import static org.junit.Assert.*;

import org.junit.Test;

public class MaxDiffTest {
  @Test
  public void basicTests() {
    assertEquals("only positives", 4, Kata.maxDiff(new int[] {1, 2, 3, 4, 5, 5, 4}));
    assertEquals("only negatives", 30, Kata.maxDiff(new int[] {-4, -5, -3, -1, -31}));
    assertEquals("positives and negatives", 10, Kata.maxDiff(new int[] {1, 2, 3, 4, -5, 5, 4}));
    assertEquals("single element", 0, Kata.maxDiff(new int[] {1000000}));
    assertEquals("empty", 0, Kata.maxDiff(new int[] {}));
  }
}
