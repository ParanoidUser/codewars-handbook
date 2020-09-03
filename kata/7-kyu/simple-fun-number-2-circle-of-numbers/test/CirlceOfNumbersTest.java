import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CirlceOfNumbersTest {
  @Test
  void sample() {
    assertEquals(7, CircleOfNumbers.circleOfNumbers(10, 2));
    assertEquals(2, CircleOfNumbers.circleOfNumbers(10, 7));
    assertEquals(3, CircleOfNumbers.circleOfNumbers(4, 1));
    assertEquals(0, CircleOfNumbers.circleOfNumbers(6, 3));
    assertEquals(10, CircleOfNumbers.circleOfNumbers(20, 0));
  }
}
