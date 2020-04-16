import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataTest {
  @Test
  public void testSurvivalChances() {
    assertEquals(0.5, Kata.getChance(2, 1, 1), 0);
    assertEquals(0.25, Kata.getChance(4, 1, 3), 0);
    assertEquals(0.33, Kata.getChance(100, 10, 10), 0);
  }
}
