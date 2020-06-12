import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("theStealthWarrior", Solution.toCamelCase("the_Stealth_Warrior"));
    assertEquals("theStealthWarrior", Solution.toCamelCase("the-Stealth-Warrior"));
  }
}
