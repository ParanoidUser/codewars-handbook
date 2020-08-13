import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;


class SolutionTest {
  @Test
  void sample() {
    var colors = List.of("white", "yellow", "purple", "red");
    assertTrue(colors.contains(new Ghost().getColor()));
  }
}
