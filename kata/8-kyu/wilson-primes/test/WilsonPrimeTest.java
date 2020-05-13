import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class WilsonPrimeTest {
  @Test
  void sample() {
    assertTrue(WilsonPrime.am_i_wilson(5));
    assertTrue(WilsonPrime.am_i_wilson(13));
    assertTrue(WilsonPrime.am_i_wilson(563));
    assertFalse(WilsonPrime.am_i_wilson(0));
    assertFalse(WilsonPrime.am_i_wilson(1));
    assertFalse(WilsonPrime.am_i_wilson(700));
  }
}
