import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testBasic() {
    assertEquals(9, Kata.squareSum(new int[] {1, 2, 2}));
    assertEquals(5, Kata.squareSum(new int[] {1, 2}));
    assertEquals(50, Kata.squareSum(new int[] {5, -3, 4}));
  }
}
