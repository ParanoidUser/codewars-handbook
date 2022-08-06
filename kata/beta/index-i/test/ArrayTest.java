import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class ArrayTest {
  @Test
  void sample() {
    assertNotNull(Array.array);
    assertNotEquals(0, Array.array.length);
    for (int i = 0; i < Array.array.length; i++) {
      assertEquals(Array.array[i], Array.array(i));
    }
  }
}