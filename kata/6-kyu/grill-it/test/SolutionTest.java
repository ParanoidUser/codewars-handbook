import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("df", GrillIt.grille("abcdef", 5));
    assertEquals("", GrillIt.grille("", 5));
    assertEquals("d", GrillIt.grille("abcd", 1));
    assertEquals("b", GrillIt.grille("0abd", 2));
    assertEquals("codewars", GrillIt.grille("tcddoadepwweasresd", 77098));
  }
}