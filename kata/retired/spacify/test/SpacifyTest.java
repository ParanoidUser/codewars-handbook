import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SpacifyTest {
  @Test
  void sample() {
    assertEquals("h e l l o   w o r l d", Spacify.spacify("hello world"));
    assertEquals("1 2 3 4 5", Spacify.spacify("12345"));
  }
}
