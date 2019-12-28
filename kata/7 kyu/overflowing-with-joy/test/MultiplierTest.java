import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplierTest {
  @Test
  public void test00() {
    assertEquals(0, Multiplier.multiply(0, 0));
  }

  @Test
  public void test2345() {
    assertEquals(1035, Multiplier.multiply(23, 45));
  }

  @Test
  public void test3456() {
    assertEquals(-1904, Multiplier.multiply(-34, 56));
  }

  @Test
  public void testMin() {
    assertEquals(Integer.MIN_VALUE, Multiplier.multiply(-32768, 65536));
  }

  @Test
  public void testMax() {
    assertEquals(Integer.MAX_VALUE - 1, Multiplier.multiply(42966, 49981));
  }

  @Test(expected = ArithmeticException.class)
  public void testOverflowMax() {
    Multiplier.multiply(Integer.MAX_VALUE, Integer.MAX_VALUE);
  }

  @Test(expected = ArithmeticException.class)
  public void testOverflowMin() {
    Multiplier.multiply(Integer.MIN_VALUE, Integer.MIN_VALUE);
  }

  @Test(expected = ArithmeticException.class)
  public void testOverflowMaxMin() {
    Multiplier.multiply(Integer.MAX_VALUE, Integer.MIN_VALUE);
  }

  @Test(expected = ArithmeticException.class)
  public void testOverflow1() {
    Multiplier.multiply(39650, 54161);
  }

  @Test(expected = ArithmeticException.class)
  public void testOverflow2() {
    Multiplier.multiply(42967, 49981);
  }
}
