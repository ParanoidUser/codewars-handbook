import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("3->10->5->16->8->4->2->1", Collatz.collatz(3));
  }
}
