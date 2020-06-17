import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(0, new Null().hashCode());
    assertEquals(new Null().hashCode(), new Null().hashCode());
    assertEquals(null, new Null());
    assertEquals(new Null(), new Null());
    assertEquals("null", new Null().toString());
    Null n = new Null();
    assertEquals(n, n);
    assertNotEquals(new Object(), new Null());
  }
}
