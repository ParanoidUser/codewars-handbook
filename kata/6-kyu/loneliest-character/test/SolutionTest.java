import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new char[]{'a'}, LoneChar.loneliest("a"));
    assertArrayEquals(new char[]{'g'}, LoneChar.loneliest("abc d   ef  g   h i j      "));
    assertArrayEquals(new char[]{'b'}, LoneChar.loneliest("a   b   c "));
    assertArrayEquals(new char[]{'z'}, LoneChar.loneliest("  abc  d  z    f gk s "));
    assertArrayEquals(new char[]{'b', 'c'}, LoneChar.loneliest("a  b  c  de  "));
    assertArrayEquals(new char[]{'a', 'b', 'c'}, LoneChar.loneliest("abc"));
  }
}