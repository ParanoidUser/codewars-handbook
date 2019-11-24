import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertTrue(Kata.CheckIfFlush(new String[] {"AS", "3S", "9S", "KS", "4S"}));
    assertFalse(Kata.CheckIfFlush(new String[] {"AD", "4S", "7H", "KC", "5S"}));
    assertFalse(Kata.CheckIfFlush(new String[] {"AD", "4S", "10H", "KC", "5S"}));
    assertTrue(Kata.CheckIfFlush(new String[] {"QD", "4D", "10D", "KD", "5D"}));
  }
}
