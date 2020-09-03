import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class LineNumberingTest {
  @Test
  void sample() {
    assertEquals(List.of(), LineNumbering.number(List.of()));
    assertEquals(List.of("1: a", "2: b", "3: c"), LineNumbering.number(List.of("a", "b", "c")));
    assertEquals(List.of("1: ", "2: ", "3: ", "4: ", "5: "), LineNumbering.number(List.of("", "", "", "", "")));
  }
}
