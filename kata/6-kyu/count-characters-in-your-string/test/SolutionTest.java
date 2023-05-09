import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(Map.of(), Kata.count(""));
    assertEquals(Map.of('a', 1), Kata.count("a"));
    assertEquals(Map.of('a', 5), Kata.count("aaaaa"));
    assertEquals(Map.of('a', 2, 'b', 2), Kata.count("aabb"));
    assertEquals(Map.of('a', 1, 'b', 1, 'c', 1), Kata.count("abc"));
    assertEquals(Map.of('a', 3, 'b', 3, 'c', 1), Kata.count("aabbbac"));
  }
}