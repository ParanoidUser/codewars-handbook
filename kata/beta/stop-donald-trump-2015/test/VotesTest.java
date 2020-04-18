import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class VotesTest {
  @Test
  void testStandard1() {
    int[][] votes = {{12, 44}, {10, 11}, {93, 129}, {4, 6}, {40, 39}, {1, 0}};
    assertArrayEquals(new int[]{160, 229}, Votes.getSum(votes));
  }

  @Test
  void testStandard2() {
    int[][] votes = {{0, 1}, {0, 1}, {40, 0}, {0, 1}};
    assertArrayEquals(new int[]{40, 3}, Votes.getSum(votes));
  }

  @Test
  void testStandard3() {
    int[][] votes = {{953, 1105}};
    assertArrayEquals(new int[]{953, 1105}, Votes.getSum(votes));
  }
}