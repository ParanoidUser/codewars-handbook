import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Kata13DecemberTest {
  @Test
  void sample() {
    assertEquals(List.of(1, 3), Kata13December.filterOddNumber(List.of(1, 2, 2, 2, 4, 3, 4)));
    assertEquals(List.of(1, 3, 5, 7), Kata13December.filterOddNumber(List.of(1, 2, 2, 2, 4, 3, 4, 5, 6, 7)));
  }
}
