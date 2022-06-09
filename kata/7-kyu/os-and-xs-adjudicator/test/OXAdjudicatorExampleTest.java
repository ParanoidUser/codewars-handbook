import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class OXAdjudicatorExampleTest {
  @Test
  void sample() {
    assertEquals("X_WIN", OXAdjudicator.judge(List.of(0, 1, 4, 8, 3, 6, 5)));
    assertEquals("O_WIN", OXAdjudicator.judge(List.of(0, 2, 4, 5, 6, 8)));
    assertEquals("NO_WINNER", OXAdjudicator.judge(List.of(4, 2, 8, 0, 1, 7, 5, 3, 6)));
  }
}
