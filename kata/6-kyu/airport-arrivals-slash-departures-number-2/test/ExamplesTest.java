import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ExamplesTest {
  @Test
  public void exampleFlapRotors() {
    String[] before = new String[] {"CAT"};
    String[] after = new String[] {"DOG"};
    int[][] rotors = {{1, 13, 27}};
    assertArrayEquals(rotors, Dinglemouse.flapRotors(before, after));
  }

  @Test
  public void basicFlapRotors() {
    String[] before = new String[] {"HELLO "};
    String[] after = new String[] {"WORLD!"};
    int[][] rotors = {{15, 49, 50, 48, 43, 13}};
    assertArrayEquals(rotors, Dinglemouse.flapRotors(before, after));

    before = new String[] {"CODE"};
    after = new String[] {"WARS"};
    rotors = new int[][] {{20, 20, 28, 0}};
    assertArrayEquals(rotors, Dinglemouse.flapRotors(before, after));
  }
}
