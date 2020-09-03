import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleBlowfishTest {
  @Test
  void sample() {
    assertEquals("", new SimpleBlowfish().encrypt("", ""));
    assertEquals("", new SimpleBlowfish().encrypt("", "tandy"));
    assertEquals("tandy", new SimpleBlowfish().encrypt("tandy", ""));

    assertEquals(new SimpleBlowfish().encrypt("a", "a"), new SimpleBlowfish().encrypt("a", "abc"));
    assertEquals(new SimpleBlowfish().encrypt("ab", "ab"), new SimpleBlowfish().encrypt("ab", "abcbb"));

    char[] expected = {24929, 24930, 24931};
    assertEquals(String.valueOf(expected), new SimpleBlowfish().encrypt("abc", "a"));

    expected = new char[]{18259, 21104, 17785, 16672, 21611, 18281, 21108};
    assertEquals(String.valueOf(expected), new SimpleBlowfish().encrypt("Spy kit", "GREAT"));
  }
}
