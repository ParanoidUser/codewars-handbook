import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TriangularTest {
  @Test
  void sample() {
    assertEquals(3, Triangular.triangular(2));
    assertEquals(10, Triangular.triangular(4));
    assertEquals(0, Triangular.triangular(0));
  }
}
