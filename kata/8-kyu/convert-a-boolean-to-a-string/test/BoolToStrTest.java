import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BoolToStrTest {
  @Test
  void sample() {
    assertEquals("true", BooleanToString.convert(true));
    assertEquals("false", BooleanToString.convert(false));
  }
}
