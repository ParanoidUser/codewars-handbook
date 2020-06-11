import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ASumTest {
  @Test
  void sample() {
    assertEquals(2022, ASum.findNb(4183059834009L));
    assertEquals(4824, ASum.findNb(135440716410000L));
    assertEquals(3568, ASum.findNb(40539911473216L));
    assertEquals(55100, ASum.findNb(2304422822859502500L));
    assertEquals(-1, ASum.findNb(24723578342962L));
  }
}
