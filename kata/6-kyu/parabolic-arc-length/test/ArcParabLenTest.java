import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArcParabLenTest {
  @Test
  void test() {
    assertEquals(1.414213562, ArcParabLen.lenCurve(1), 1e-9);
    assertEquals(1.478197397, ArcParabLen.lenCurve(10), 1e-9);
  }
}
