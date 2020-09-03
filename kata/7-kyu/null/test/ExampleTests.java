import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals("null", new Null().toString());
    assertEquals(0, new Null().hashCode());
    assertEquals(new Null().hashCode(), new Null().hashCode());
    assertEquals(new Null(), null);
    assertEquals(new Null(), new Null());
    Null n = new Null();
    assertEquals(n, n);
    assertNotEquals(new Null(), new Object());
  }
}
