import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LargestFiveDigitNumberTest {
  @Test
  void sample() {
    assertEquals(83910, LargestFiveDigitNumber.solve("283910"));
    assertEquals(67890, LargestFiveDigitNumber.solve("1234567890"));
  }
}