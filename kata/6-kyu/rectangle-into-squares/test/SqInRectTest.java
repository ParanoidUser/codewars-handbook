import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import org.junit.jupiter.api.Test;

class SqInRectTest {
  @Test
  void sample() {
    assertEquals(List.of(3, 2, 1, 1), SqInRect.sqInRect(5, 3));
    assertNull(SqInRect.sqInRect(5, 5));
  }
}
