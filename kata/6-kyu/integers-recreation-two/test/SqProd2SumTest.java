import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SqProd2SumTest {

  @Test
  void sample() {
    var sum0 = SqProd2Sum.prod2Sum(100, 100, 100, 100);
    assertEquals(1, sum0.size());
    assertArrayEquals(new long[]{0, 20000}, sum0.get(0));

    var sum1 = SqProd2Sum.prod2Sum(1, 2, 1, 3);
    assertEquals(2, sum1.size());
    assertArrayEquals(new long[]{1, 7}, sum1.get(0));
    assertArrayEquals(new long[]{5, 5}, sum1.get(1));

    var sum2 = SqProd2Sum.prod2Sum(2, 3, 4, 5);
    assertEquals(2, sum2.size());
    assertArrayEquals(new long[]{2, 23}, sum2.get(0));
    assertArrayEquals(new long[]{7, 22}, sum2.get(1));

    var sum3 = SqProd2Sum.prod2Sum(2, 3, 5, 4);
    assertEquals(2, sum3.size());
    assertArrayEquals(new long[]{7, 22}, sum3.get(0));
    assertArrayEquals(new long[]{2, 23}, sum3.get(1));

    var sum4 = SqProd2Sum.prod2Sum(-5, -4, 3, 2);
    assertEquals(2, sum4.size());
    assertArrayEquals(new long[]{-23, 2}, sum4.get(0));
    assertArrayEquals(new long[]{-22, 7}, sum4.get(1));

    var sum5 = SqProd2Sum.prod2Sum(4, 5, -3, -2);
    assertEquals(2, sum5.size());
    assertArrayEquals(new long[]{-22, 7}, sum5.get(0));
    assertArrayEquals(new long[]{-23, 2}, sum5.get(1));

    var sum6 = SqProd2Sum.prod2Sum(2, -3, 4, -5);
    assertEquals(2, sum6.size());
    assertArrayEquals(new long[]{2, 23}, sum6.get(0));
    assertArrayEquals(new long[]{-22, 7}, sum6.get(1));

    var sum7 = SqProd2Sum.prod2Sum(2, -3, 4, 5);
    assertEquals(2, sum7.size());
    assertArrayEquals(new long[]{-7, 22}, sum7.get(0));
    assertArrayEquals(new long[]{-2, 23}, sum7.get(1));
  }
}
