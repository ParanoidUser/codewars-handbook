import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestConverter {
  @Test
  void sample() {
    assertEquals(3.54f, Converter.mpgToKPM(10), 0.001f);
    assertEquals(7.08f, Converter.mpgToKPM(20), 0.001f);
    assertEquals(10.62f, Converter.mpgToKPM(30), 0.001f);
  }
}
