import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals(0, Kata.findJane(2));
    assertEquals(4, Kata.findJane(10));
  }
}
