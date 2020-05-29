import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    var n1 = Solution.filter(new Node<>(1, new Node<>(2, new Node<>(3))), x -> true);
    assertEquals(1, n1.data);
    assertEquals(2, n1.next.data);
    assertEquals(3, n1.next.next.data);
    assertNull(n1.next.next.next);

    var n2 = Solution.filter(new Node<>(1, new Node<>(2, new Node<>(3))), x -> x < 3);
    assertEquals(1, n2.data);
    assertEquals(2, n2.next.data);
    assertNull(n2.next.next);

    var n3 = Solution.filter(new Node<>(1, new Node<>(2, new Node<>(3))), x -> x == 1);
    assertEquals(1, n3.data);
    assertNull(n3.next);

    assertNull(Solution.filter(null, x -> false));
  }
}