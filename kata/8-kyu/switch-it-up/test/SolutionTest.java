import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("One", Kata.switchItUp(1));
    assertEquals("Three", Kata.switchItUp(3));
    assertEquals("Five", Kata.switchItUp(5));
  }
}
