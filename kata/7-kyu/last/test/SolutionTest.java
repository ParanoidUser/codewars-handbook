import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(Integer.valueOf(5), Solution.last(List.of(1, 2, 3, 4, 5)));
    assertEquals('e', Solution.last("abcde"));
    assertEquals(Integer.valueOf(5), Solution.last(1, 2, 3, 4, 5));
  }
}
