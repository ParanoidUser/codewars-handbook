import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;

class PrimeFactorizerTest {
  @Test
  void sample() {
    assertEquals(Map.of(13L, 1), new PrimeFactorizer().factor(13L));
    assertEquals(Map.of(2L, 3, 3L, 1), new PrimeFactorizer().factor(24L));
    assertEquals(Map.of(7L, 3), new PrimeFactorizer().factor(343L));
  }
}
