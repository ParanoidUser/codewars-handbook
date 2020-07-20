import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ApproxFloatTest {
  @Test
  void sample() {
    assertEquals(1.29999999155e-08, ApproxFloat.f(2.6e-08), 1e-12);
    assertEquals(6.999999997549999e-10, ApproxFloat.f(1.4e-09), 1e-12);
    assertEquals(2.499996875007812e-06, ApproxFloat.f(5.0e-06), 1e-12);
    assertEquals(1.1999999280000085e-07, ApproxFloat.f(2.4e-07), 1e-12);
  }
}
