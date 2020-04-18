import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BadHashTest {
  @Test
  void testHash3() {
    assertEquals("@", BadHash.hash("a"));
  }

  @Test
  void testHash5() {
    assertEquals("X!$", BadHash.hash(" Yo, What's Good! - "));
  }

  @Test
  void testHash6() {
    assertEquals("0y-z-z!1", BadHash.hash("Hi!"));
  }
}
