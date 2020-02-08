import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConversionTest {
  @Test
  public void shouldConvertToRoman() {
    assertEquals("solution(1) should equal to I", "I", Conversion.solution(1));
    assertEquals("solution(4) should equal to IV", "IV", Conversion.solution(4));
    assertEquals("solution(6) should equal to VI", "VI", Conversion.solution(6));
    assertEquals("solution(1) should equal to I", "MCCXXXIV", Conversion.solution(1234));
    assertEquals("solution(1) should equal to I", "MMMCCCXXI", Conversion.solution(3321));
    assertEquals("solution(1) should equal to I", "MDCCCXCIX", Conversion.solution(1899));
  }
}
