import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PrimorialTest {
  @Test
  void sample() {
    assertEquals("30", Primorial.numPrimorial(3));
    assertEquals("210", Primorial.numPrimorial(4));
    assertEquals("2310", Primorial.numPrimorial(5));
    assertEquals("9699690", Primorial.numPrimorial(8));
    assertEquals("223092870", Primorial.numPrimorial(9));
  }
}
