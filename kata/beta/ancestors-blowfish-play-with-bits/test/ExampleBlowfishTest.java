import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleBlowfishTest {
  @Test
  void sample() {
    assertEquals("", SimpleBlowfish.encrypt("", ""));
    assertEquals("", SimpleBlowfish.encrypt("", "tandy"));
    assertEquals("tandy", SimpleBlowfish.encrypt("tandy", ""));

    assertEquals(SimpleBlowfish.encrypt("a", "a"), SimpleBlowfish.encrypt("a", "abc"));
    assertEquals(SimpleBlowfish.encrypt("ab", "ab"), SimpleBlowfish.encrypt("ab", "abcbb"));

    char[] expected = {24929, 24930, 24931};
    assertEquals(String.valueOf(expected), SimpleBlowfish.encrypt("abc", "a"));

    expected = new char[]{18259, 21104, 17785, 16672, 21611, 18281, 21108};
    assertEquals(String.valueOf(expected), SimpleBlowfish.encrypt("Spy kit", "GREAT"));
  }
}
