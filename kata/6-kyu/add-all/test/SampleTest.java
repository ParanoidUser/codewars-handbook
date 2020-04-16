import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void basicTests() {
    assertEquals(9, Kata.addAll(new int[] {1, 2, 3}));
    assertEquals(19, Kata.addAll(new int[] {1, 2, 3, 4}));
    assertEquals(33, Kata.addAll(new int[] {1, 2, 3, 4, 5}));
  }
}
