import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HowManyNumbersTest {
  @Test
  void sample() {
    assertEquals(0, HowManyNumbers.selNumber(0, 1));
    assertEquals(0, HowManyNumbers.selNumber(3, 1));
    assertEquals(1, HowManyNumbers.selNumber(13, 1));
    assertEquals(1, HowManyNumbers.selNumber(15, 1));
    assertEquals(2, HowManyNumbers.selNumber(20, 2));
    assertEquals(4, HowManyNumbers.selNumber(30, 2));
    assertEquals(6, HowManyNumbers.selNumber(44, 2));
    assertEquals(12, HowManyNumbers.selNumber(50, 3));
    assertEquals(21, HowManyNumbers.selNumber(100, 3));
  }
}
