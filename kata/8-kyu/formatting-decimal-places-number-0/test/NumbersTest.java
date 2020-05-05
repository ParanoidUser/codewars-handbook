import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumbersTest {
  @Test
  void sample() {
    assertEquals(4.66, Numbers.TwoDecimalPlaces(4.659725356), 0.00);
    assertEquals(173735326.38, Numbers.TwoDecimalPlaces(173735326.3783732637948948), 0.00);
  }
}
