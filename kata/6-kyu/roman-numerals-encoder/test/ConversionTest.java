import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConversionTest {
  @Test
  void sample() {
    assertEquals("I", new Conversion().solution(1));
    assertEquals("IV", new Conversion().solution(4));
    assertEquals("VI", new Conversion().solution(6));
    assertEquals("MCCXXXIV", new Conversion().solution(1234));
    assertEquals("MMMCCCXXI", new Conversion().solution(3321));
    assertEquals("MDCCCXCIX", new Conversion().solution(1899));
  }
}
