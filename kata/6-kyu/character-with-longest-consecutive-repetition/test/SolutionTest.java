import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new Object[]{"a", 4}, Solution.longestRepetition("bbbaaabaaaa"));
    assertArrayEquals(new Object[]{"a", 4}, Solution.longestRepetition("aaaabb"));
    assertArrayEquals(new Object[]{"u", 3}, Solution.longestRepetition("cbdeuuu900"));
    assertArrayEquals(new Object[]{"b", 5}, Solution.longestRepetition("abbbbb"));
    assertArrayEquals(new Object[]{"a", 2}, Solution.longestRepetition("aabb"));
    assertArrayEquals(new Object[]{"", 0}, Solution.longestRepetition(""));
  }
}
