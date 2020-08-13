import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EightiesKids2Test {
  @Test
  void sample() {
    assertEquals("[0, 0]", EightiesKids2.findSpaceship("X"));
    assertEquals("[0, 0]", EightiesKids2.findSpaceship("..\nX."));
    assertEquals("[1, 0]", EightiesKids2.findSpaceship("..\n.X"));
    assertEquals("[0, 1]", EightiesKids2.findSpaceship("X.\n.."));
    assertEquals("[1, 1]", EightiesKids2.findSpaceship(".X\n.."));
    assertEquals("Spaceship lost forever.", EightiesKids2.findSpaceship("..\n.."));
  }
}
