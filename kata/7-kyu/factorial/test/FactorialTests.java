import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTests {
  @Test
  public void test_factorial0() {
    assertEquals(1, Factorial.factorial(0));
  }

  @Test
  public void test_factorial3() {
    assertEquals(6, Factorial.factorial(3));
  }

  @Test
  public void test_factorial5() {
    assertEquals(120, Factorial.factorial(5));
  }
}
