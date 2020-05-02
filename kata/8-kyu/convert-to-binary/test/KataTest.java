import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals(1, Kata.toBinary(1));
    assertEquals(10, Kata.toBinary(2));
    assertEquals(11, Kata.toBinary(3));
    assertEquals(101, Kata.toBinary(5));
  }
}
