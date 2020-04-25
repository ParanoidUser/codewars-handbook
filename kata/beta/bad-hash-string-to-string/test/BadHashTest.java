import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BadHashTest {
  @Test
  void sample() {
    assertEquals("!B", BadHash.hash(""));
    assertEquals("`", BadHash.hash(" "));
    assertEquals("@", BadHash.hash("a"));
    assertEquals("X!$", BadHash.hash(" Yo, What's Good! - "));
    assertEquals("0y-z-z!1", BadHash.hash("Hi!"));
  }
}
