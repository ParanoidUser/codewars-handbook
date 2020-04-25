import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    String[] queue = new String[]{"Sally", "Jim", "Bob", "Kate"};
    assertEquals("Sally", Kata.findInQueue(queue, 1));
    assertEquals("Bob", Kata.findInQueue(queue, 3));
    assertEquals("Kate", Kata.findInQueue(queue, 4));
  }
}