import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class KataTests {
  @Test
  public void basicTests() {
    assertTrue(Kata.smallEnough(new int[] {66, 101}, 200));
    assertFalse(Kata.smallEnough(new int[] {78, 117, 110, 99, 104, 117, 107, 115}, 100));
    assertTrue(Kata.smallEnough(new int[] {101, 45, 75, 105, 99, 107}, 107));
    assertTrue(Kata.smallEnough(new int[] {80, 117, 115, 104, 45, 85, 112, 115}, 120));
  }
}
