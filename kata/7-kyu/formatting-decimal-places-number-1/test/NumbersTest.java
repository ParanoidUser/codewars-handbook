import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumbersTest {
  @Test
  void sample() {
    assertEquals(10.12, Numbers.twoDecimalPlaces(10.1289767789), 0.00);
    assertEquals(-7488.83, Numbers.twoDecimalPlaces(-7488.83485834983), 0.00);
  }
}
