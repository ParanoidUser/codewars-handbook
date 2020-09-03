import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class SimpleIntegerTest {
  @Test
  void testEqualsAndHashCode() {
    var one = new SimpleInteger(1);
    assertEquals(one, one);
    assertNotEquals(one, new Object());
    assertEquals(one, new SimpleInteger(1));
    assertNotEquals(one, new SimpleInteger(2));
    assertEquals(1923, one.hashCode());
  }
}