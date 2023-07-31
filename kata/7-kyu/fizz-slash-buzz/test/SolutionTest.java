import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{5, 2, 1}, FizzBuzz.solution(20));
    assertArrayEquals(new int[]{0, 0, 0}, FizzBuzz.solution(2));
    assertArrayEquals(new int[]{4, 2, 0}, FizzBuzz.solution(14));
    assertArrayEquals(new int[]{8, 4, 1}, FizzBuzz.solution(30));
    assertArrayEquals(new int[]{37, 19, 9}, FizzBuzz.solution(141));
  }
}