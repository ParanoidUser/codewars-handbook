import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GivenTuneTests {
  @Test
  public void exampleTests() {
    assertTrue(Kata.isTune(new int[] {1, 3, 6, 8, 10, 12}));
    assertTrue(Kata.isTune(new int[] {1, 3, 6, 8, 10, 12, 13, 15}));
    assertTrue(Kata.isTune(new int[] {1, 6, 3}));
    assertFalse(Kata.isTune(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}));
    assertTrue(Kata.isTune(new int[] {2, 4, 7, 9, 11, 13}));
  }
}
