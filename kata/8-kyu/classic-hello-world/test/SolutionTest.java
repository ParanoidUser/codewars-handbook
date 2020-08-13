import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    var console = new ByteArrayOutputStream();
    System.setOut(new PrintStream(console));
    Solution.main(null);
    assertEquals("Hello World!" + System.lineSeparator(), console.toString());
  }
}
