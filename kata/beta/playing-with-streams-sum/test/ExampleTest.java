import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class ExampleTest {
  @Test
  void sample() {
    assertEquals(45, Kata.sum(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)));
    assertEquals(100, Kata.sum(List.of(22, 37, 41)));
    assertEquals(8250, Kata.sum(List.of(5912, 154, 1643, 191, 350)));
  }
}