import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SequenceTest {
  @Test
  void sample() {
    assertEquals(50, Sequence.getScore(1));
    assertEquals(150, Sequence.getScore(2));
    assertEquals(300, Sequence.getScore(3));
    assertEquals(500, Sequence.getScore(4));
    assertEquals(750, Sequence.getScore(5));
  }
}
