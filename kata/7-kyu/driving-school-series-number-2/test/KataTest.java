import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals(30, Kata.cost(1));
    assertEquals(30, Kata.cost(45));
    assertEquals(30, Kata.cost(63));
    assertEquals(40, Kata.cost(84));
    assertEquals(50, Kata.cost(102));
    assertEquals(100, Kata.cost(273));
  }
}
