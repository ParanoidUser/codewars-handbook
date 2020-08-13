import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArgeTest {
  @Test
  void sample() {
    assertEquals(15, Arge.nbYear(1500, 5, 100, 5000));
    assertEquals(10, Arge.nbYear(1500000, 2.5, 10000, 2000000));
    assertEquals(94, Arge.nbYear(1500000, 0.25, 1000, 2000000));
  }
}
