import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PythagoreanTripleTest {
  @Test
  void sample() {
    assertEquals(1, new PythagoreanTriple().pythagoreanTriple(new int[]{3, 4, 5}));
    assertEquals(0, new PythagoreanTriple().pythagoreanTriple(new int[]{3, 5, 7}));
  }
}
