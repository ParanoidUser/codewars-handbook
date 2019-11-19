import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryCalculatorTest {
  @Test
  public void test_1() {
    assertEquals("10", BinaryCalculator.calculate("1", "1", "add"));
  }

  @Test
  public void test_2() {
    assertEquals("0", BinaryCalculator.calculate("1", "1", "subtract"));
  }

  @Test
  public void test_3() {
    assertEquals("1", BinaryCalculator.calculate("1", "1", "multiply"));
  }

  @Test
  public void test_4() {
    assertEquals("0", BinaryCalculator.calculate("1", "0", "multiply"));
  }
}
