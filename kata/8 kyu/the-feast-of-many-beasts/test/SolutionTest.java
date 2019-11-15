import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void fixedTest() {
    assertTrue(Kata.feast("great blue heron", "garlic nann"));
    assertTrue(Kata.feast("chickadee", "chocolate cake"));
    assertFalse(Kata.feast("brown bear", "bear claw"));
  }
}
