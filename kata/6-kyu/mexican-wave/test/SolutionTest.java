import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTest1() {
    String[] result = new String[] {"Hello", "hEllo", "heLlo", "helLo", "hellO"};
    assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave("hello"));
  }

  @Test
  public void basicTest2() {
    String[] result = new String[] {"Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs", "codewaRs", "codewarS"};
    assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave("codewars"));
  }

  @Test
  public void basicTest3() {
    String[] result = new String[] {};
    assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave(""));
  }

  @Test
  public void basicTest4() {
    String[] result = new String[] {"Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS"};
    assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave("two words"));
  }

  @Test
  public void basicTest5() {
    String[] result = new String[] {" Gap ", " gAp ", " gaP "};
    assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave(" gap "));
  }
}
