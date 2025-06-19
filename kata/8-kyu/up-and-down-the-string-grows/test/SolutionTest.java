import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    String upDown = StrangeString.STRANGE_STRING.toUpperCase().toLowerCase();
    assertEquals(StrangeString.STRANGE_STRING.length() + 1, upDown.length());
  }

  @Test
  void solutionSize() throws Exception {
    Path current = Paths.get("").toAbsolutePath();
    Path solution = current.resolve("main/StrangeString.java");
    assertTrue(Files.size(solution) < 81, "Solution should be 80 characters max.");
  }
}