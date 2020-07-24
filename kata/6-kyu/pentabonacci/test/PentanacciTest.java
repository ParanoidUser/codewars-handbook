import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PentanacciTest {
  @Test
  void sample() {
    assertEquals(15, Pentanacci.countOddPentaFib(45));
    assertEquals(23, Pentanacci.countOddPentaFib(68));
    assertEquals(25, Pentanacci.countOddPentaFib(76));
    assertEquals(33, Pentanacci.countOddPentaFib(100));
    assertEquals(40, Pentanacci.countOddPentaFib(121));
  }
}
