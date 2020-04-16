import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    Node<Integer> list = new Node<>(1, new Node<>(2, new Node<>(3)));
    assertEquals(new Node<>(2, new Node<>(4, new Node<>(6))), Solution.map(list, i -> i * 2));
  }
}
