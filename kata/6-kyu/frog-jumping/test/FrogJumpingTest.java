import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FrogJumpingTest {
  @Test
  void sample() {
    assertEquals(-1, FrogJumping.solution(new int[0]));
    assertEquals(-1, FrogJumping.solution(new int[]{1, -1}));
    assertEquals(-1, FrogJumping.solution(new int[]{1, 0, 2}));
    assertEquals(-1, FrogJumping.solution(new int[]{1, 2, 1, 2, -3, -4}));
    assertEquals(1, FrogJumping.solution(new int[]{-3}));
    assertEquals(1, FrogJumping.solution(new int[]{-1, -1, -2}));
    assertEquals(3, FrogJumping.solution(new int[]{1, 2, 1, 5}));
    assertEquals(4, FrogJumping.solution(new int[]{1, 1, 1, 1}));
    assertEquals(4, FrogJumping.solution(new int[]{1, 2, 2, -1}));
    assertEquals(6, FrogJumping.solution(new int[]{1, 2, 3, 1, -2, 1}));
    assertEquals(9, FrogJumping.solution(new int[]{1, 1, 1, 1, 5, 1, 1, 1, 1, 1, 1, 1, 1}));
  }
}
