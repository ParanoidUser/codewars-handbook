import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MultiplierTest {
  @Test
  void sample() {
    assertEquals(0, Multiplier.multiply(0, 0));
    assertEquals(1035, Multiplier.multiply(23, 45));
    assertEquals(-1904, Multiplier.multiply(-34, 56));
    assertEquals(Long.MIN_VALUE, Multiplier.multiply(-2147483648L, 4294967296L));
    assertEquals(Long.MAX_VALUE, Multiplier.multiply(2323823089L, 3969050863L));
    assertThrows(ArithmeticException.class, () -> Multiplier.multiply(Long.MAX_VALUE, Long.MAX_VALUE));
    assertThrows(ArithmeticException.class, () -> Multiplier.multiply(Long.MIN_VALUE, Long.MIN_VALUE));
    assertThrows(ArithmeticException.class, () -> Multiplier.multiply(Long.MAX_VALUE, Long.MIN_VALUE));
    assertThrows(ArithmeticException.class, () -> Multiplier.multiply(119537721L, 77158673929L));
    assertThrows(ArithmeticException.class, () -> Multiplier.multiply(-2761311370L, 3340214413L));
  }
}