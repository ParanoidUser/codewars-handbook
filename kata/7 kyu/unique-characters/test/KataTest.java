import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {
  @Test
  public void simpleTests() {
    assertTrue(Kata.hasUniqueChars(""));
    assertTrue(Kata.hasUniqueChars("abc"));
    assertFalse(Kata.hasUniqueChars("a b c"));
  }
}
