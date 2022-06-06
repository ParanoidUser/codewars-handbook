import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SqInRectTest {
  @Test
  void sample() {
    assertEquals(List.of(3, 2, 1, 1), SqInRect.sqInRect(5, 3));
    assertEquals(List.of(), SqInRect.sqInRect(5, 5));
  }
}
