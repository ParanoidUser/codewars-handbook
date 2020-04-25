import static java.util.regex.Pattern.compile;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    var regex = compile(Kata.regexContainsAll("abc"));
    assertTrue(regex.matcher("bca").find());
    assertTrue(regex.matcher("baczzz").find());
    assertFalse(regex.matcher("ac").find());
    assertFalse(regex.matcher("bc").find());
    assertFalse(regex.matcher("cb").find());
  }
}