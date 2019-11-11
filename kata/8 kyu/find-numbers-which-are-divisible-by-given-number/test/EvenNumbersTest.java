import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvenNumbersTest {
  @Test
  public void testSimple() {
    assertEquals(new int[] {2, 4, 6}, EvenNumbers.divisibleBy(new int[] {1, 2, 3, 4, 5, 6}, 2));
    assertEquals(new int[] {3, 6}, EvenNumbers.divisibleBy(new int[] {1, 2, 3, 4, 5, 6}, 3));
    assertEquals(new int[] {0, 4}, EvenNumbers.divisibleBy(new int[] {0, 1, 2, 3, 4, 5, 6}, 4));
  }
}
