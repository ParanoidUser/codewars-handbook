import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals(123, Kata.filterString("123"));
    assertEquals(123, Kata.filterString("a1b2c3"));
    assertEquals(123, Kata.filterString("aa1bb2cc3dd"));
  }
}