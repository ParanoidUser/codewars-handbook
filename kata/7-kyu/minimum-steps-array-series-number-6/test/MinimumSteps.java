import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumSteps {
  @Test
  public void checkSmallArraySize() {
    assertEquals(1, Kata.minimumSteps(new int[] {4, 6, 3}, 7));
    assertEquals(1, Kata.minimumSteps(new int[] {10, 9, 9, 8}, 17));
  }

  @Test
  public void checkLargerArraySize() {
    assertEquals(3, Kata.minimumSteps(new int[] {8, 9, 4, 2}, 23));
    assertEquals(8, Kata.minimumSteps(new int[] {19, 98, 69, 28, 75, 45, 17, 98, 67}, 464));
  }
}
