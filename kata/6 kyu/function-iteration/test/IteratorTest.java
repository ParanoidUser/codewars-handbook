import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IteratorTest {
  @Test
  public void testDoubling() {
    assertEquals("getDouble",  4, (int) GetIterator.getIterator(x -> x * 2, 1).apply(2));
    assertEquals("getQuadruple",  8, (int) GetIterator.getIterator(x -> x * 2, 2).apply(2));
  }
}
