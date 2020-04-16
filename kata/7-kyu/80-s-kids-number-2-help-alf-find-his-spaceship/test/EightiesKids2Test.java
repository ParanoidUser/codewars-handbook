import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EightiesKids2Test {
  @Test
  public void test1x1Map() {
    assertEquals("[0, 0]", EightiesKids2.findSpaceship("X"));
  }

  @Test
  public void test2x2Map() {
    assertEquals("[0, 0]", EightiesKids2.findSpaceship("..\nX."));
    assertEquals("[1, 0]", EightiesKids2.findSpaceship("..\n.X"));
    assertEquals("[0, 1]", EightiesKids2.findSpaceship("X.\n.."));
    assertEquals("[1, 1]", EightiesKids2.findSpaceship(".X\n.."));
    assertEquals("Spaceship lost forever.", EightiesKids2.findSpaceship("..\n.."));
  }
}
