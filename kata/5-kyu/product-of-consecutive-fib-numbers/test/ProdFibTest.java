import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ProdFibTest {
  @Test
  void sample() {
    assertArrayEquals(new long[]{55, 89, 1}, ProdFib.productFib(4895));
    assertArrayEquals(new long[]{89, 144, 0}, ProdFib.productFib(5895));
  }
}