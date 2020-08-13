import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    Counter mycounter = new Counter();
    mycounter.increment();
    mycounter.increment();
    assertEquals(2, mycounter.check());
  }
}
