import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  @Test
  void descendingTest() {
    assertArrayEquals(new String[]{":D", ":D", ":(", "T_T"}, Solution.sortEmotions(true, new String[]{":D", "T_T", ":D", ":("}));
    assertArrayEquals(new String[]{":D", ":(", ":(", "T_T"}, Solution.sortEmotions(true, new String[]{"T_T", ":D", ":(", ":("}));
    assertArrayEquals(new String[]{":D", ":D", ":)", ":)", "T_T"}, Solution.sortEmotions(true, new String[]{":)", "T_T", ":)", ":D", ":D"}));
  }

  @Test
  void ascendingTest() {
    assertArrayEquals(new String[]{"T_T", ":(", ":D", ":D"}, Solution.sortEmotions(false, new String[]{":D", "T_T", ":D", ":("}));
    assertArrayEquals(new String[]{"T_T", ":(", ":(", ":D"}, Solution.sortEmotions(false, new String[]{"T_T", ":D", ":(", ":("}));
    assertArrayEquals(new String[]{"T_T", ":)", ":)", ":D", ":D"}, Solution.sortEmotions(false, new String[]{":)", "T_T", ":)", ":D", ":D"}));
  }

  @Test
  void emptyArray() {
    assertArrayEquals(new String[]{}, Solution.sortEmotions(false, new String[]{}));
    assertArrayEquals(new String[]{}, Solution.sortEmotions(true, new String[]{}));
  }
}