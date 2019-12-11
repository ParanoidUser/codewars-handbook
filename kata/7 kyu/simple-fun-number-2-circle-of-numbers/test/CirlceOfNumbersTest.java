import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CirlceOfNumbersTest {
  @Test
  public void basicTests() {
    assertEquals(7, CircleOfNumbers.circleOfNumbers(10, 2));
    assertEquals(2, CircleOfNumbers.circleOfNumbers(10, 7));
    assertEquals(3, CircleOfNumbers.circleOfNumbers(4, 1));
    assertEquals(0, CircleOfNumbers.circleOfNumbers(6, 3));
    assertEquals(10, CircleOfNumbers.circleOfNumbers(20, 0));
  }
}
