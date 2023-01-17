import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertFalse(Solution.anyMatch(null, b -> false));
    assertTrue(Solution.allMatch(null, b -> false));
    assertFalse(Solution.anyMatch(null, b -> true));
    assertTrue(Solution.allMatch(null, b -> true));

    var ints = new Node<>(1, new Node<>(2, new Node<>(3)));
    assertFalse(Solution.anyMatch(ints, b -> false));
    assertFalse(Solution.allMatch(ints, b -> false));
    assertTrue(Solution.anyMatch(ints, b -> true));
    assertTrue(Solution.allMatch(ints, b -> true));

    assertTrue(Solution.anyMatch(ints, x -> x < 3));
    assertFalse(Solution.anyMatch(ints, x -> x == 4));
    assertTrue(Solution.allMatch(ints, x -> x < 4));
    assertFalse(Solution.allMatch(ints, x -> x > 4));

    var strings = new Node<>("aaa", new Node<>("b", new Node<>("abc")));
    assertTrue(Solution.anyMatch(strings, x -> x.contains("a")));
    assertFalse(Solution.allMatch(strings, x -> x.contains("a")));
    assertFalse(Solution.anyMatch(strings, x -> x.indexOf("b") == 3));
    assertFalse(Solution.allMatch(strings, x -> x.contains("b")));
  }
}