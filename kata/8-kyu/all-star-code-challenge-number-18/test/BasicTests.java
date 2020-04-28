import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BasicTests {
  @Test
  void sample() {
    assertEquals(1, CodeWars.strCount("Hello", 'o'));
    assertEquals(2, CodeWars.strCount("Hello", 'l'));
    assertEquals(0, CodeWars.strCount("", 'z'));
  }
}
