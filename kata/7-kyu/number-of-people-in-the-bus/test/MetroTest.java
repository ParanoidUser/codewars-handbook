import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class MetroTest {
  @Test
  void sample() {
    assertEquals(5, new Metro().countPassengers(List.of(new int[]{10, 0}, new int[]{3, 5}, new int[]{2, 5})));
  }
}
