import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SqProd2SumTest {
  @Test
  void sample() {
    var sum1 = SqProd2Sum.prod2Sum(1, 2, 1, 3);
    assertEquals(2, sum1.size());
    assertArrayEquals(new long[] {1, 7}, sum1.get(0));
    assertArrayEquals(new long[] {5, 5}, sum1.get(1));

    var sum2 = SqProd2Sum.prod2Sum(2, 3, 4, 5);
    assertEquals(2, sum2.size());
    assertArrayEquals(new long[] {2, 23}, sum2.get(0));
    assertArrayEquals(new long[] {7, 22}, sum2.get(1));

    var sum3 = SqProd2Sum.prod2Sum(100, 100, 100, 100);
    assertEquals(1, sum3.size());
    assertArrayEquals(new long[] {0, 20000}, sum3.get(0));
  }
}
