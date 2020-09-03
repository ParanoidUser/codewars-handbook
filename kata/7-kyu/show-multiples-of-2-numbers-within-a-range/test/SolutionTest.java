import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(List.of(4, 8, 12, 16, 20, 24, 28, 32, 36), Solution.findMultiples(2, 4, 40));
    assertEquals(List.of(112, 224, 336, 448, 560, 672, 784, 896), Solution.findMultiples(7, 16, 1000));
    assertEquals(List.of(65, 130, 195, 260, 325, 390, 455, 520, 585, 650, 715, 780), Solution.findMultiples(5, 13, 800));
  }
}
