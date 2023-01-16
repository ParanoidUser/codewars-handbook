import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void circularListTest() {
    var xs = new CircularList<>("one", "two", "three");
    assertEquals("one", xs.next());
    assertEquals("two", xs.next());
    assertEquals("three", xs.next());
    assertEquals("one", xs.next());
    assertEquals("three", xs.prev());
    assertEquals("two", xs.prev());
    assertEquals("one", xs.prev());
    assertEquals("three", xs.prev());

    var ys = new CircularList<>(1, 2, 3, 4, 5);
    assertEquals(5, ys.prev());
    assertEquals(4, ys.prev());
    assertEquals(5, ys.next());
    assertEquals(1, ys.next());
    assertEquals(2, ys.next());
    assertEquals(3, ys.next());
    assertEquals(4, ys.next());
    assertEquals(3, ys.prev());
    assertEquals(2, ys.prev());
    assertEquals(3, ys.next());
    assertEquals(4, ys.next());
    assertEquals(5, ys.next());
    assertEquals(1, ys.next());
    assertEquals(2, ys.next());
    assertEquals(3, ys.next());
  }

  @Test
  void circularErrorTest() {
    assertThrows(RuntimeException.class, CircularList::new);
  }
}