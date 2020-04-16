import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void example() {
    String[] before = new String[] {"CAT"};
    int[][] rotors = new int[][] {{1, 13, 27}};
    assertArrayEquals(new String[] {"DOG"}, Dinglemouse.flapDisplay(before, rotors));
  }

  @Test
  public void basic() {
    String[] before = new String[] {"HELLO "};
    int[][] rotors = new int[][] {{15, 49, 50, 48, 43, 13}};
    assertArrayEquals(new String[] {"WORLD!"}, Dinglemouse.flapDisplay(before, rotors));

    String[] before2 = new String[] {"CODE"};
    int[][] rotors2 = new int[][] {{20, 20, 28, 0}};
    assertArrayEquals(new String[] {"WARS"}, Dinglemouse.flapDisplay(before2, rotors2));
  }
}
