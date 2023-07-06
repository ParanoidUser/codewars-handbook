import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  @Test
  void sample() {
    String[] actual = new ScrollingTextMachine().rotate("Hello");
    assertArrayEquals(new String[]{"elloH", "lloHe", "loHel", "oHell", "Hello"}, actual);
  }
}