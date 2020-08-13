import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArithmeticSequenceTest {
  @Test
  void sample() {
    assertEquals(42, Sequence.nthterm(14, 4, 7));
    assertEquals(55, Sequence.nthterm(0, 55, 1));
    assertEquals(99, Sequence.nthterm(0, 99, 1));
    assertEquals(500, Sequence.nthterm(0, 100, 5));
    assertEquals(4500, Sequence.nthterm(10000, 110, -50));
    assertEquals(5050, Sequence.nthterm(10000, 99, -50));
  }
}
