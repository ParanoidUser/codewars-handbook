import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
          a-z, abcdefghijklmnopqrstuvwxyz
          h-o, hijklmno
          Q-Z, QRSTUVWXYZ
          J-J, J
          a-b, ab
          a-a, a
          g-i, ghi
          H-I, HI
          y-z, yz
          e-k, efghijk
          a-q, abcdefghijklmnopq
          F-O, FGHIJKLMNO
      """)
  void sample(String s, String ans) {
    assertEquals(ans, Solution.gimmeTheLetters(s));
  }
}