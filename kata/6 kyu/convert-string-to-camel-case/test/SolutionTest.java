import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomeUnderscoreLowerStart() {
    assertEquals("theStealthWarrior", Solution.toCamelCase("the_Stealth_Warrior"));
  }

  @Test
  public void testSomeDashLowerStart() {
    assertEquals("theStealthWarrior", Solution.toCamelCase("the-Stealth-Warrior"));
  }
}
