import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Solution.countIf(null, t -> false));
    assertEquals(0, Solution.countIf(null, t -> true));

    var ints = new Node<>(1, new Node<>(2, new Node<>(3)));
    assertEquals(0, Solution.countIf(ints, t -> false));
    assertEquals(3, Solution.countIf(ints, t -> true));
    assertEquals(2, Solution.countIf(ints, x -> x < 3));
    assertEquals(1, Solution.countIf(ints, x -> x == 1));

    var strings = new Node<>("aaa", new Node<>("b", new Node<>("abc")));
    assertEquals(2, Solution.countIf(strings, x -> x.contains("a")));
    assertEquals(1, Solution.countIf(strings, x -> x.indexOf('b') == 1));
  }
}