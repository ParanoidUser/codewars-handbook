import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BrokenSequenceTests {
  @Test
  void sample() {
    assertEquals(1, new BrokenSequence().findMissingNumber("2 1 4 3 a"));
    assertEquals(0, new BrokenSequence().findMissingNumber(""));
    assertEquals(2, new BrokenSequence().findMissingNumber("1 3"));
    assertEquals(4, new BrokenSequence().findMissingNumber("1 2 3 5"));
  }
}
