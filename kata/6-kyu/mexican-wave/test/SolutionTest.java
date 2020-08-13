import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"Hello", "hEllo", "heLlo", "helLo", "hellO"}, MexicanWave.wave("hello"));
    assertArrayEquals(new String[]{"Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS"}, MexicanWave.wave("two words"));
    assertArrayEquals(new String[]{"Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs", "codewaRs", "codewarS"}, MexicanWave.wave("codewars"));
    assertArrayEquals(new String[]{" Gap ", " gAp ", " gaP "}, MexicanWave.wave(" gap "));
    assertArrayEquals(new String[0], MexicanWave.wave(""));
  }
}
