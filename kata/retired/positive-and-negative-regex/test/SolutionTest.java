
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue("pot".matches(Kata.reg));
    assertTrue("support".matches(Kata.reg));
    assertTrue("Sparta".matches(Kata.reg));
    assertTrue("slap two".matches(Kata.reg));
    assertTrue("respite".matches(Kata.reg));
    assertTrue("deepest".matches(Kata.reg));
    assertTrue("stop-item".matches(Kata.reg));
    assertTrue("a spector".matches(Kata.reg));

    assertFalse("pt".matches(Kata.reg));
    assertFalse("Pot".matches(Kata.reg));
    assertFalse("pilates".matches(Kata.reg));
    assertFalse("pilot".matches(Kata.reg));
    assertFalse("parachute".matches(Kata.reg));
    assertFalse("spaghetti".matches(Kata.reg));
    assertFalse("tap".matches(Kata.reg));
  }
}