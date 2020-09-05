import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("srawedoc", Solution.solve("codewars"));
    assertEquals("edoc ruoy", Solution.solve("your code"));
    assertEquals("skco redo cruoy", Solution.solve("your code rocks"));
  }
}
