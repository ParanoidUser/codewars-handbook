import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals(List.of(), Kata.getNumbers(List.of(), 21));
    assertEquals(List.of(), Kata.getNumbers(List.of(1, 2, 3, 4, 5, 6, 2, 7, 5, 0, 10), 21));
    assertEquals(List.of(11, 10), Kata.getNumbers(List.of(15, 10, 11, 12, 20, 0, 11, 7), 21));
    assertEquals(List.of(10, 7, 6, 5, 4, 1), Kata.getNumbers(List.of(1, 2, 3, 4, 5, 6, 2, 7, 5, 0, 10), 11));
  }
}