import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(2, Kata.solution(1, 1));
    assertEquals(17, Kata.solution(4, 3));
    assertEquals(10, Kata.solution(2, 4));
    assertEquals(300, Kata.solution(22, 10));
    assertEquals(2875, Kata.solution(49, 50));
  }
}
