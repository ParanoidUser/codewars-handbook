import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeDecompTest {
  @Test
  void sample() {
    assertEquals("(2**2)(3**3)(5)(7)(11**2)(17)", PrimeDecomp.factors(7775460));
    assertEquals("(2**2)(331)(15881)", PrimeDecomp.factors(21026444));
  }
}