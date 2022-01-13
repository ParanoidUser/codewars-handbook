import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
  @Test
  void sample() {
    assertEquals(3375, Kata.boxCapacity(20, 20, 20));
    assertEquals(13824, Kata.boxCapacity(32, 64, 16));
    assertEquals(25740, Kata.boxCapacity(70, 60, 15));
    assertEquals(27000, Kata.boxCapacity(80, 40, 20));
  }
}
