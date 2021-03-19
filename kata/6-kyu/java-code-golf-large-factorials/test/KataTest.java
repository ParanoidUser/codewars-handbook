import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals("1", C.f(1));
    assertEquals("120", C.f(5));
    assertEquals("362880", C.f(9));
    assertEquals("1307674368000", C.f(15));
  }
}