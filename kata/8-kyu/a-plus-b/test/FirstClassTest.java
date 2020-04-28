import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FirstClassTest {
  @Test
  void sample() {
    assertEquals(3, FirstClass.sum((byte) 1, (byte) 2));
  }
}
