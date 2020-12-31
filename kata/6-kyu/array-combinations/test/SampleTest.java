import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals(4, Kata.solve(List.of(List.of(1, 2), List.of(4), List.of(5, 6))));
    assertEquals(4, Kata.solve(List.of(List.of(1, 2), List.of(4, 4), List.of(5, 6, 6))));
    assertEquals(8, Kata.solve(List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6))));
    assertEquals(72, Kata.solve(List.of(List.of(1, 2, 3), List.of(3, 4, 6, 6, 7), List.of(8, 9, 10, 12, 5, 6))));
  }
}