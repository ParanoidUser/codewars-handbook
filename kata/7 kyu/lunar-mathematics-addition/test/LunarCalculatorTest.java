import static org.junit.Assert.*;

import org.junit.Test;

public class LunarCalculatorTest {
  @Test
  public void test_LunarMathAdd_GetsCorrectAnswer_SimpleTests() {
    assertEquals("4 + 5 ", 5, LunarCalculator.add(4, 5));
    assertEquals("5 + 5", 5, LunarCalculator.add(5, 5));
    assertEquals("6 + 3", 6, LunarCalculator.add(6, 3));
    assertEquals("5 + 0", 5, LunarCalculator.add(5, 0));
  }

  @Test
  public void test_LunarMathAdd_GetsCorrectAnswer_DoubleDigitTests() {
    assertEquals("10 + 20", 20, LunarCalculator.add(10, 20));
    assertEquals("30 + 11", 31, LunarCalculator.add(30, 11));
    assertEquals("19 + 91", 99, LunarCalculator.add(91, 19));
    assertEquals("Two digits in the first number, one digit in the second number", 51, LunarCalculator.add(50, 1));
    assertEquals("One digit in the first number, two digits in the second number", 51, LunarCalculator.add(1, 50));
  }

  @Test
  public void test_LunarMathAdd_GetsCorrectAnswer_EdgeCases() {
    assertEquals("100 + 0", 100, LunarCalculator.add(100, 0));
    assertEquals("100 + 20", 120, LunarCalculator.add(100, 20));
    assertEquals(11099, LunarCalculator.add(99, 11085));
    assertEquals(59, LunarCalculator.add(58, 19));
    assertEquals("Integer.MAX_VALUE + 0", Integer.MAX_VALUE, LunarCalculator.add(Integer.MAX_VALUE, 0));
    assertEquals("Integer.MAX_VALUE + INTEGER.MAX_VALUE", Integer.MAX_VALUE, LunarCalculator.add(Integer.MAX_VALUE, Integer.MAX_VALUE));
    assertEquals(987656789, LunarCalculator.add(123456789, 987654321));
  }
}
