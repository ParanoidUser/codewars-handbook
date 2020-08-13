import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    Generator g = new Generator();
    assertEquals(1, g.next());
    assertEquals(2, g.next());
    assertEquals(3, g.next());
    assertEquals(4, g.next());
    assertEquals(5, g.next());
    assertEquals(10, g.next(10));
  }
}
