import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BadHashTest {
  @Test
  void sample() {
    assertEquals("!B", new BadHash().hash(""));
    assertEquals("`", new BadHash().hash(" "));
    assertEquals("@", new BadHash().hash("a"));
    assertEquals("X!$", new BadHash().hash(" Yo, What's Good! - "));
    assertEquals("0y-z-z!1", new BadHash().hash("Hi!"));
  }
}
