import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(10, new MixedSum().sum(Arrays.asList(5, "5")));
    assertEquals(22, new MixedSum().sum(Arrays.asList(9, 3, "7", "3")));
    assertEquals(42, new MixedSum().sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
    assertEquals(41, new MixedSum().sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    assertEquals(45, new MixedSum().sum(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));
    assertEquals(41, new MixedSum().sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    assertEquals(61, new MixedSum().sum(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
  }
}
