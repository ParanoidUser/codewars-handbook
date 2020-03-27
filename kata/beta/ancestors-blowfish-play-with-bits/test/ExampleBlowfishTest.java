import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleBlowfishTest {
  @Test
  public void basicTests() {
    assertEquals("", SimpleBlowfish.encrypt("", ""));
    assertEquals("", SimpleBlowfish.encrypt("", "tandy"));
    assertEquals("tandy", SimpleBlowfish.encrypt("tandy", ""));

    assertEquals(SimpleBlowfish.encrypt("a", "a"), SimpleBlowfish.encrypt("a", "abc"));
    assertEquals(SimpleBlowfish.encrypt("ab", "ab"), SimpleBlowfish.encrypt("ab", "abcbb"));

    char[] expected = {24929, 24930, 24931};
    assertEquals(String.valueOf(expected), SimpleBlowfish.encrypt("abc", "a"));

    expected = new char[] {18259, 21104, 17785, 16672, 21611, 18281, 21108};
    assertEquals(String.valueOf(expected), SimpleBlowfish.encrypt("Spy kit", "GREAT"));
  }
}
