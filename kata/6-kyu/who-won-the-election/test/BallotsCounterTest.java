import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import org.junit.jupiter.api.Test;


class BallotsCounterTest {
  @Test
  void sample() {
    assertEquals("A", BallotsCounter.getWinner(List.of("A")));
    assertEquals("A", BallotsCounter.getWinner(List.of("A", "A", "A", "B", "B", "B", "A")));
    assertNull(BallotsCounter.getWinner(List.of("A", "A", "A", "B", "B", "B")));
    assertNull(BallotsCounter.getWinner(List.of("A", "A", "A", "B", "C", "B")));
    assertNull(BallotsCounter.getWinner(List.of("A", "A", "B", "B", "C")));
  }
}
