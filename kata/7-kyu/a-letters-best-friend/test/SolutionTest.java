import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      '', x, y
      xaeaex, a, e
      he headed to the store, h, e
      i found an ounce with my hound, o, u
      those were their thorns they said, t, h
      """)
  void friends(String txt, char a, char b) {
    assertTrue(Kata.bestFriend(txt, a, b));
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
      a test, t, e
      abcdee, e, e
      abcde, e, e
      we found your dynamite, d, y
      look they took the cookies, o, o
      """)
  void strangers(String txt, char a, char b) {
    assertFalse(Kata.bestFriend(txt, a, b));
  }
}