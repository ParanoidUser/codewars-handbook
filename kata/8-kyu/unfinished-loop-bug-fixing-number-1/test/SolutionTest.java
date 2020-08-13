import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(List.of(1), new Kata().CreateList(1));
    assertEquals(List.of(1, 2), new Kata().CreateList(2));
    assertEquals(List.of(1, 2, 3), new Kata().CreateList(3));
    assertEquals(List.of(1, 2, 3, 4), new Kata().CreateList(4));
    assertEquals(List.of(1, 2, 3, 4, 5), new Kata().CreateList(5));
  }
}
