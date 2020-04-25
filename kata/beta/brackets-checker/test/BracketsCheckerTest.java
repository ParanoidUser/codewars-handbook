import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BracketsCheckerTest {
  @Test
  void sample() {
    assertTrue(BracketsChecker.bracketsChecker("(hello evrybody)"));
    assertTrue(BracketsChecker.bracketsChecker("(Hello! My name is [{Roman}])"));
    assertTrue(BracketsChecker.bracketsChecker("(a),[b(c)],{d}"));
    assertFalse(BracketsChecker.bracketsChecker("} - bracket"));
    assertFalse(BracketsChecker.bracketsChecker("[1] - the first example without ("));
    assertFalse(BracketsChecker.bracketsChecker(") a b c"));
    assertFalse(BracketsChecker.bracketsChecker("( a b [c) {}"));
    assertFalse(BracketsChecker.bracketsChecker("( a b [c]  }"));
  }
}
