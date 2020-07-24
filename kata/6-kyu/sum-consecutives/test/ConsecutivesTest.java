import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class ConsecutivesTest {
  @Test
  void sample() {
    assertEquals(List.of(1, 12, 0, 4, 6, 1), Consecutives.sumConsecutives(List.of(1, 4, 4, 4, 0, 4, 3, 3, 1)));
    assertEquals(List.of(-10, 14, 12, 0), Consecutives.sumConsecutives(List.of(-5, -5, 7, 7, 12, 0)));
  }
}
