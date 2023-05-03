import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathEvaluatorTest {
  @Test
  void sample() {
    var math = new MathEvaluator();
    assertEquals(123, math.calculate("123"), 0.01);
    assertEquals(-123, math.calculate("-123"), 0.01);
    assertEquals(0, math.calculate("1 - 1"), 0.01);
    assertEquals(2, math.calculate("1+1"), 0.01);
    assertEquals(1, math.calculate("1* 1"), 0.01);
    assertEquals(-12, math.calculate("12*-1"), 0.01);
    assertEquals(-12, math.calculate("-12*1"), 0.01);
    assertEquals(1, math.calculate("1 /1"), 0.01);
    assertEquals(1476, math.calculate("12* 123"), 0.01);
    assertEquals(3, math.calculate("(1 - 2) + -(-(-(-4)))"), 0.01);
    assertEquals(492, math.calculate("12* 123/-(-5 + 2)"), 0.01);
    assertEquals(61, math.calculate("((80 - (19)))"));
    assertEquals(21.25, math.calculate("2 /2+3 * 4.75- -6"), 0.01);
    assertEquals(7.732, math.calculate("2 / (2 + 3) * 4.33 - -6"), 0.01);
  }
}