import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(List.of(1), Kata.CreateList(1));
    assertEquals(List.of(1, 2), Kata.CreateList(2));
    assertEquals(List.of(1, 2, 3), Kata.CreateList(3));
    assertEquals(List.of(1, 2, 3, 4), Kata.CreateList(4));
    assertEquals(List.of(1, 2, 3, 4, 5), Kata.CreateList(5));
  }
}
