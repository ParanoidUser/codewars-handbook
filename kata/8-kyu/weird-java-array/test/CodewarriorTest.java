import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class CodewarriorTest {
  @Test
  void sample() {
    var expected = List.of(
        List.of(1, 2, 3),
        List.of(4, 5, 6),
        List.of(7, 8, 9)
    );

    for (int i = 0; i < expected.size(); i++) {
      assertEquals(expected.get(i), Codewarrior.arrayOfLists[i]);
    }
  }
}