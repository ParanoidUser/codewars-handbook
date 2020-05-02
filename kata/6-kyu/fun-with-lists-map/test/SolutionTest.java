import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    var list = new Node<>(1, new Node<>(2, new Node<>(3)));
    var doubled = Solution.map(list, i -> i * 2);
    assertEquals(2, doubled.data);
    assertEquals(4, doubled.next.data);
    assertEquals(6, doubled.next.next.data);
  }
}
