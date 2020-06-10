import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class FloatRepresentTest {
  @Test
  void sample() {
    assertEquals("6000000000P-11", FloatRepresent.mantExp(new BigDecimal("0.06"), 10));
    assertEquals("720000000000P-10", FloatRepresent.mantExp(new BigDecimal("72.0"), 12));
    assertEquals("10000P-4", FloatRepresent.mantExp(new BigDecimal("1.0"), 5));
    assertEquals("1234P2", FloatRepresent.mantExp(new BigDecimal("123456.0"), 4));
    assertEquals("1103000000P-9", FloatRepresent.mantExp(new BigDecimal("1.103000"), 10));
    assertEquals("103000000000000P-15", FloatRepresent.mantExp(new BigDecimal("0.103000000"), 15));
  }
}
