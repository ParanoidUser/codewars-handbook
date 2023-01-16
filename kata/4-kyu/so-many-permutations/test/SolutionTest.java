import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(List.of("a"), Permutations.singlePermutations("a"));
    assertEquals(List.of("ab", "ba"), Permutations.singlePermutations("ab"));
    assertEquals(List.of("aabb", "abab", "abba", "baab", "baba", "bbaa"), Permutations.singlePermutations("aabb"));
  }
}