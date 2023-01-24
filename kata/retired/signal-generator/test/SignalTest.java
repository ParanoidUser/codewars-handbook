import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

class SignalTest {

  @Test
  void linear() {
    var it = new SignalIterator(0, 3, 2, 1);
    for (int i = 0; i <= 10; i++) {
      assertTrue(it.hasNext());
      assertEquals(0, it.next(), 0.1);
    }
  }

  @Test
  void sine() {
    var it = new SignalIterator(2, 3, 0, .5);
    assertTrue(it.hasNext());
    assertEquals(1.99, it.next(), 0.1);
    assertEquals(0.28, it.next(), 0.1);
    assertEquals(-1.95, it.next(), 0.1);
    assertEquals(-0.55, it.next(), 0.1);
    assertEquals(1.87, it.next(), 0.1);
    assertEquals(0.82, it.next(), 0.1);
    assertEquals(-1.75, it.next(), 0.1);
    assertEquals(-1.07, it.next(), 0.1);
    assertEquals(1.60, it.next(), 0.1);
    assertEquals(1.30, it.next(), 0.1);
  }

  @Test
  void negative() {
    var it = mock(SignalIterator.class);
    when(it.hasNext()).thenReturn(false);
    when(it.next()).thenCallRealMethod();
    assertThrows(NoSuchElementException.class, it::next);
  }
}