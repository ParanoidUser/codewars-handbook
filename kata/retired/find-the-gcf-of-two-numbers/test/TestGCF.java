import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestGCF {
  @Test
  void sample() {
    assertEquals(4, Kata.findGCF(8, 20));
    assertEquals(1, Kata.findGCF(5, 13));
    assertEquals(100, Kata.findGCF(100, 100));
  }
}
