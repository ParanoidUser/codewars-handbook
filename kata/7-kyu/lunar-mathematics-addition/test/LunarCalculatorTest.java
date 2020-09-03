import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LunarCalculatorTest {
  @Test
  void sample() {
    assertEquals(5, LunarCalculator.add(4, 5));
    assertEquals(5, LunarCalculator.add(5, 5));
    assertEquals(6, LunarCalculator.add(6, 3));
    assertEquals(5, LunarCalculator.add(5, 0));
    assertEquals(20, LunarCalculator.add(10, 20));
    assertEquals(31, LunarCalculator.add(30, 11));
    assertEquals(59, LunarCalculator.add(58, 19));
    assertEquals(51, LunarCalculator.add(50, 1));
    assertEquals(51, LunarCalculator.add(1, 50));
    assertEquals(99, LunarCalculator.add(91, 19));
    assertEquals(100, LunarCalculator.add(100, 0));
    assertEquals(120, LunarCalculator.add(100, 20));
    assertEquals(11099, LunarCalculator.add(99, 11085));
    assertEquals(987656789, LunarCalculator.add(123456789, 987654321));
    assertEquals(Integer.MAX_VALUE, LunarCalculator.add(Integer.MAX_VALUE, 0));
    assertEquals(Integer.MAX_VALUE, LunarCalculator.add(Integer.MAX_VALUE, Integer.MAX_VALUE));
  }
}
