import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {
  @Test
  public void shouldWorkWithEmptyString() {
    assertEquals("Should work with empty string", 0, Calc.evaluate(""), 0);
  }

  @Test
  public void shouldParseNumbers() {
    assertEquals("Should parse numbers", 3, Calc.evaluate("3"), 0);
  }

  @Test
  public void shouldParseFloatNumbers() {
    assertEquals("Should parse float numbers", 3.5, Calc.evaluate("3.5"), 0);
  }

  @Test
  public void shouldSupportAddition() {
    assertEquals("Should support addition", 4, Calc.evaluate("1 3 +"), 0);
  }

  @Test
  public void shouldSupportMultiplication() {
    assertEquals("Should support multiplication", 3, Calc.evaluate("1 3 *"), 0);
  }

  @Test
  public void shouldSupportSubstraction() {
    assertEquals("Should support substraction", -2, Calc.evaluate("1 3 -"), 0);
  }

  @Test
  public void shouldSupportDivision() {
    assertEquals("Should support division", 2, Calc.evaluate("4 2 /"), 0);
  }
}
