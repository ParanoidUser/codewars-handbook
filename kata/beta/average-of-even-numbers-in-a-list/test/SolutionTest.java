import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(6.0, EvenAverage.averageOfEvens(List.of(2, 4, 6, 8, 10)));
    assertEquals(0.0, EvenAverage.averageOfEvens(List.of(1, 3, 5)));
    assertEquals(20.0, EvenAverage.averageOfEvens(List.of(10, 15, 20, 25, 30)));
    assertEquals(0.0, EvenAverage.averageOfEvens(List.of(0, 0, 0)));
    assertEquals(-5.0, EvenAverage.averageOfEvens(List.of(1, -4, -6, 3)));
  }
}