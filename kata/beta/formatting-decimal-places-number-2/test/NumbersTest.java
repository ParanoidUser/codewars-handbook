import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumbersTest {
  @Test
  void sample() {
    assertEquals(1234.79, Numbers.paste(1234, 79), 0.00);
    assertEquals(98435789.26, Numbers.paste(98435789, 26), 0.00);
  }
}