import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IteratorTest {
  @Test
  void sample() {
    assertEquals(4, (int) GetIterator.getIterator(x -> x * 2, 1).apply(2));
    assertEquals(8, (int) GetIterator.getIterator(x -> x * 2, 2).apply(2));
  }
}
