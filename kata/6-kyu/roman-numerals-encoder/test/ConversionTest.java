import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConversionTest {
  @Test
  void sample() {
    assertEquals("I", Conversion.solution(1));
    assertEquals("IV", Conversion.solution(4));
    assertEquals("VI", Conversion.solution(6));
    assertEquals("MCCXXXIV", Conversion.solution(1234));
    assertEquals("MMMCCCXXI", Conversion.solution(3321));
    assertEquals("MDCCCXCIX", Conversion.solution(1899));
  }
}
